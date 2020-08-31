package gef.ecabldesigner.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.*;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;

import diagram.CableDiagram;
import diagram.DiagramFactory;
import diagram.DiagramPackage;
import gef.ecabledesigner.ECableDesignerDefaultContentGenerator;

/**
 * This is a sample new wizard. Its role is to create a new file resource in the
 * provided container. If the container resource (a folder or a project) is
 * selected in the workspace when the wizard is opened, it will accept it as the
 * target container. The wizard creates one file with the extension "diagram".
 * If a sample multi-page editor (also available as a template) is registered
 * for the same extension, it will be able to open it.
 */

public class ECableDiagramNewWizard extends Wizard implements INewWizard {
	private ECableDiagramNewWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for ECableDiagramNewWizard.
	 */
	public ECableDiagramNewWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {
		page = new ECableDiagramNewWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We will
	 * create an operation and run it using wizard as execution context.
	 */
	@Override
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		IRunnableWithProgress op = monitor -> {
			try {
				doFinish(containerName, fileName, monitor);
			} catch (CoreException e) {
				throw new InvocationTargetException(e);
			} finally {
				monitor.done();
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * The worker method. It will find the container, create the file if missing or
	 * just replace its contents, and open the editor on the newly created file.
	 */

	private void doFinish(String containerName, String fileName, IProgressMonitor monitor) throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 3);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName));
		try {
			InputStream stream = openContentStream();
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Generating Default Model Content");

		CableDiagram cableDiagram = ECableDesignerDefaultContentGenerator.createContents();
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecd", new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(DiagramPackage.eNS_URI, DiagramPackage.eINSTANCE);

		// If there are no arguments, emit an appropriate usage message.
		//
		System.out.println("Enter a list of file paths or URIs that have content like this:");
		try {
			Resource emfResource = resourceSet.createResource(URI.createFileURI(file.getFullPath().toOSString()));
			emfResource.getContents().add(cableDiagram);
			emfResource.save(null);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		
		file.refreshLocal(IResource.DEPTH_ZERO, monitor);
		monitor.worked(1);
		
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(() -> {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			try {
				IDE.openEditor(page, file, true);
			} catch (PartInitException e) {
			}
		});
		monitor.worked(1);
	}

	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openContentStream() {
		String contents = "";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status = new Status(IStatus.ERROR, "gef.ecabldesigner.ui", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}