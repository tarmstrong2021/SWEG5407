import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class GUIPaycheck extends JFrame {

	// declare components (Labels, Text Fields, Buttons)
		JLabel lblFirstName;
		JLabel lblLastName;
		JLabel lblAnnualPay;
		JLabel lblYearsWorked;
		JLabel lblItemsSold;
		JLabel lblBonus;
		JLabel lblAdditionalBonus;
		JLabel lblTotalPay;
		

		JTextField txtFirstName;
		JTextField txtLastName;
		JTextField txtAnnualPay;
		JTextField txtYearsWorked;
		JTextField txtItemsSold;
		JTextField txtBonus;
		JTextField txtAdditionalBonus;
		JTextField txtTotalPay;

		JButton btnCalculate;
		JButton btnExit;

		// constructor
		public GUIPaycheck() {

			// Set title for JFrame
			setTitle("Calculate Employee Pay");

			// create container
			Container pane = getContentPane();
			pane.setLayout(new GridLayout(10, 2));

			// Initialize labels
			lblFirstName = new JLabel("Enter First Name:  ", SwingConstants.RIGHT);
			lblLastName = new JLabel("Enter Last Name:  ", SwingConstants.RIGHT);
			lblAnnualPay = new JLabel("Enter Annual Pay:  ", SwingConstants.RIGHT);
			lblYearsWorked = new JLabel("Enter Years Worked:  ", SwingConstants.RIGHT);
			lblItemsSold = new JLabel("Enter Number of Items Sold:  ", SwingConstants.RIGHT);
			lblBonus = new JLabel("Calculated Bonus:  ", SwingConstants.RIGHT);
			lblAdditionalBonus = new JLabel("Calculated Additional Bonus:  ", SwingConstants.RIGHT);
			lblTotalPay = new JLabel("Calculated Total Pay:  ", SwingConstants.RIGHT);

			// Initialize text boxes
			txtFirstName = new JTextField();
			txtLastName = new JTextField();
			txtAnnualPay = new JTextField();
			txtYearsWorked = new JTextField();
			txtItemsSold = new JTextField();
			txtBonus = new JTextField();
			txtAdditionalBonus = new JTextField();
			txtTotalPay = new JTextField();

			// Initialize button
			// Create a class for button and implement Action Listener (see classes at
			// bottom of code)
			// Create an object for the class
			// Register object with the button object

			btnCalculate = new JButton("Calculate Pay");
			CalculateButton calcButton = new CalculateButton();
			btnCalculate.addActionListener(calcButton);
			btnExit = new JButton("Exit");
			ExitButton ebtn = new ExitButton();
			btnExit.addActionListener(ebtn);

			// add to container
			pane.add(lblFirstName);
			pane.add(txtFirstName);
			pane.add(lblLastName);
			pane.add(txtLastName);
			pane.add(lblAnnualPay);
			pane.add(txtAnnualPay);
			pane.add(lblYearsWorked);
			pane.add(txtYearsWorked);
			pane.add(lblItemsSold);
			pane.add(txtItemsSold);
			pane.add(lblBonus);
			pane.add(txtBonus);
			pane.add(lblAdditionalBonus);
			pane.add(txtAdditionalBonus);
			pane.add(lblTotalPay);
			pane.add(txtTotalPay);
			pane.add(btnCalculate);
			pane.add(btnExit);

			setSize(800, 600);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

		class CalculateButton implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String firstName, lastName;
				int yearsWorked, itemsSold;
				double annualPay, bonus, addlBonus, totalPay;
				
				firstName = txtFirstName.getText();
				lastName = txtLastName.getText();
				yearsWorked = Integer.parseInt(txtYearsWorked.getText());
				itemsSold = Integer.parseInt(txtItemsSold.getText());
				annualPay = Double.parseDouble(txtAnnualPay.getText());
				
				
				// calculate bonus
				if (yearsWorked >= 15) {
					bonus = annualPay * .1;
				} else if (yearsWorked >= 10 && yearsWorked < 15) {
					bonus = annualPay * .05;
				} else
					bonus = 0;

				// calculate additional bonus
				if (itemsSold >= 2200)
					addlBonus = annualPay * .05;
				else if (itemsSold >= 1500 && itemsSold < 2200)
					addlBonus = annualPay * .03;
				else
					addlBonus = 0;

				// calculate total pay
				totalPay = annualPay + bonus + addlBonus;

				txtBonus.setText("" + bonus);
				txtAdditionalBonus.setText("" + addlBonus);
				txtTotalPay.setText("" + totalPay);

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