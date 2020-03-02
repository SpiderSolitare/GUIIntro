
package GUIInro;



import org.eclipse.swt.widgets.Display;

import org.eclipse.swt.widgets.Shell;

import org.eclipse.swt.widgets.Button;

import org.eclipse.swt.SWT;

import org.eclipse.swt.widgets.Label;

import org.eclipse.swt.widgets.Text;

import org.eclipse.swt.events.SelectionAdapter;

import org.eclipse.swt.events.SelectionEvent;



public class Taschenrechner {



	protected Shell shell;

	private Text zahl;

	private Text ergebnis;
	private Button button;
	private Button button_1;
	private Button button_2;



	/**

	 * Launch the application.

	 * @param args

	 */

	public static void main(String[] args) {

		try {

			Taschenrechner window = new Taschenrechner();

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

		

		Button addButton = new Button(shell, SWT.NONE);

		addButton.addSelectionListener(new SelectionAdapter() {

			@Override

			public void widgetSelected(SelectionEvent e) {

				int ergebnis = Integer.parseInt(getErgebnis().getText());
				int zahl = Integer.parseInt(getZahl().getText());
				ergebnis = ergebnis + zahl;

				

				getErgebnis().setText(Integer.toString(ergebnis));
				getZahl().setText("");

				

			}

		});

		addButton.setBounds(46, 51, 75, 25);

		addButton.setText("+");

		

		zahl = new Text(shell, SWT.BORDER);

		zahl.setBounds(46, 10, 76, 21);

		

		ergebnis = new Text(shell, SWT.BORDER);

		ergebnis.setText("0");

		ergebnis.setEditable(false);

		ergebnis.setBounds(130, 10, 76, 21);
		
		button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText());
				int zahl = Integer.parseInt(getZahl().getText());
				ergebnis = ergebnis - zahl;

				

				getErgebnis().setText(Integer.toString(ergebnis));
				getZahl().setText("");
			}
		});
		button.setBounds(127, 51, 75, 25);
		button.setText("-");
		
		button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText());
				int zahl = Integer.parseInt(getZahl().getText());
				ergebnis = ergebnis / zahl;

				

				getErgebnis().setText(Integer.toString(ergebnis));
				getZahl().setText("");
			}
		});
		button_1.setBounds(46, 84, 75, 25);
		button_1.setText("/");
		
		button_2 = new Button(shell, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText());
				int zahl = Integer.parseInt(getZahl().getText());
				ergebnis = ergebnis * zahl;

				

				getErgebnis().setText(Integer.toString(ergebnis));
				getZahl().setText("");
			}
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_2.setBounds(130, 84, 75, 25);
		button_2.setText("*");



	}

	public Text getZahl() {

		return zahl;

	}

	public Text getErgebnis() {

		return ergebnis;

	}

}


