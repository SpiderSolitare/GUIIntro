package GUIInro;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Tacshenrechner {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Tacshenrechner window = new Tacshenrechner();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblZahl = new Label(shell, SWT.NONE);
		lblZahl.setBounds(88, 81, 55, 15);
		lblZahl.setText("Zahl 1:");
		
		Label lblOperation = new Label(shell, SWT.NONE);
		lblOperation.setBounds(88, 106, 55, 15);
		lblOperation.setText("Zahl 2:");
		
		Label lblZahl_1 = new Label(shell, SWT.NONE);
		lblZahl_1.setBounds(88, 134, 55, 15);
		lblZahl_1.setText("Operation: ");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(156, 75, 34, 21);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(156, 100, 34, 21);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(156, 131, 34, 21);
		
		Button btnStart = new Button(shell, SWT.NONE);
		btnStart.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
				String o = gett2().getText();
				
				String o1 = gett().getText();
				Integer z1 = Integer.parseInt(o1);
				
				String o2 = gett1().getText();
				Integer z2 = Integer.parseInt(o2);

				System.out.println(z1 + z2);

				
					String er = Integer.toString(z1+z2);
					System.out.println(er);
					gett3().setText(er);
					
				
				
				
			
			}});
		btnStart.setBounds(104, 170, 75, 25);
		btnStart.setText("Start");
		
		Button btnClear = new Button(shell, SWT.NONE);
		btnClear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
					text.setText("");
					text_1.setText("");
					text_2.setText("");
			
			}
		});
		btnClear.setBounds(239, 100, 75, 25);
		btnClear.setText("CLEAR");
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setEditable(false);
		text_3.setBounds(238, 170, 76, 21);

	}
	public Text gett3() {

		return text_3;
	}
	public Text gett2() {
		
		return text_2;
	}
public Text gett1() {
		
		return text_1;
	}

public Text gett() {
	
	return text;
}



}
