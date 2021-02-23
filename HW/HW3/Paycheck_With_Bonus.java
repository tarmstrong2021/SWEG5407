package src;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Paycheck_With_Bonus {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// create variables
		String firstName;
		String lastName;
		double annualPay;
		int yearsWorked;
		int itemsSold;
		double bonus;
		double addlBonus;
		double totalPay;

		// initialize count to be 0
		int count = 0;

		// run code inside loop while count is less than 5
		while (count < 5) {

			// input from employee
			firstName = JOptionPane.showInputDialog(null, "Please enter employee's first name");
			lastName = JOptionPane.showInputDialog(null, "Please enter employee's last name");
			annualPay = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter employees annual pay:"));
			yearsWorked = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter number of years worked:"));
			itemsSold = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of items sold this year:"));

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

			// create string for PrintWriter
			String str = ("Employee Name: " + firstName + " " + lastName + "\nBasic Salary: " + annualPay + "\nBonus: "
					+ bonus + "\nAdditional Bonus: " + addlBonus + "\nTotal Income: " + totalPay);

			// use PrintWriter to create output files named first_last
			PrintWriter printWriter = new PrintWriter(firstName + "_" + lastName);
			printWriter.write(str);
			printWriter.close();

			// display confirmation message that file has been written
			JOptionPane.showMessageDialog(null, "File printed successfully for " + firstName + " " + lastName);

			// increment count
			count++;
		}

	}
}
