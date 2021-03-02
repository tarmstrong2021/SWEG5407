import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUICube extends JFrame {

	// declare components (Labels, Text Fields, Buttons)
	JLabel lblLength;
	JLabel lblWidth;
	JLabel lblHeight;
	JLabel lblSurfaceArea;
	JLabel lblVolume;

	JTextField txtLength;
	JTextField txtWidth;
	JTextField txtHeight;
	JTextField txtSurfaceArea;
	JTextField txtVolume;

	JButton btnCalculate;
	JButton btnExit;

	// constructor
	public GUICube() {

		// Set title for JFrame
		setTitle("Surface Area and Volume of a Cuboid");

		// create container
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(6, 2));

		// Initialize labels
		lblLength = new JLabel("Enter Length:  ", SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter Width:  ", SwingConstants.RIGHT);
		lblHeight = new JLabel("Enter Height:  ", SwingConstants.RIGHT);
		lblSurfaceArea = new JLabel("Calculated Surface Area:  ", SwingConstants.RIGHT);
		lblVolume = new JLabel("Calculated Volume:  ", SwingConstants.RIGHT);

		// Initialize text boxes
		txtLength = new JTextField();
		txtWidth = new JTextField();
		txtHeight = new JTextField();
		txtSurfaceArea = new JTextField();
		txtVolume = new JTextField();

		// Initialize button
		// Create a class for button and implement Action Listener (see classes at
		// bottom of code)
		// Create an object for the class
		// Register object with the button object

		btnCalculate = new JButton("Calculate");
		CalculateButton calcButton = new CalculateButton();
		btnCalculate.addActionListener(calcButton);
		btnExit = new JButton("Exit");
		ExitButton ebtn = new ExitButton();
		btnExit.addActionListener(ebtn);

		// add to container
		pane.add(lblLength);
		pane.add(txtLength);
		pane.add(lblWidth);
		pane.add(txtWidth);
		pane.add(lblHeight);
		pane.add(txtHeight);
		pane.add(lblSurfaceArea);
		pane.add(txtSurfaceArea);
		pane.add(lblVolume);
		pane.add(txtVolume);
		pane.add(btnCalculate);
		pane.add(btnExit);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	class CalculateButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double length, width, height, surfaceArea, volume;

			length = Double.parseDouble(txtLength.getText());
			width = Double.parseDouble(txtWidth.getText());
			height = Double.parseDouble(txtHeight.getText());

			surfaceArea = 2 * ((length * width) + (width * height) + (length * height));
			volume = length * width * height;

			txtSurfaceArea.setText("" + surfaceArea);
			txtVolume.setText("" + volume);

		}
	}

	class ExitButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	}
}
