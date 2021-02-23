/*Write a program that calculates and prints the monthly paycheck for an employee.
The net pay is calculated after taking the following deductions

Federal Income Tax		:15%
State Tax:			 3.5% Social Security Tax:         5.75% Medicare:                         2.75% Pension Plan:                   5%
Health Insurance:            $75


Your program should prompt the user to input the following using JOptionPane  
1. 	Employee’s First name
2.	Employee’s Last Name
3.	Employee’s gross pay


Your program should calculate the net pay after the above deductions and send the output to a file. The file name should have the Employee’s name in it.

A sample output file that contains the following details:

Monthly Paycheck of Bama Govindaraja  
Gross Pay:		3575.00
Federal Tax:		 536.25
State Tax:		 125.00
Social Security Tax:       205.56
Medicare:                        98.31
Pension Plan:		  178.75
Health Insurance:            75.00
*******************************
Net Pay:                      2356.00

*******************************  */

import java.io.PrintWriter;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class Paycheck {

    public static void main(String[] args) throws FileNotFoundException {


        String firstName;
        String lastName;
        double grossPay;
        double federalTax;
        double stateTax;
        double socialSecurity;
        double medicare;
        double pensionPlan;
        double healthInsurance;
        double netPay;

        String calculator = "Monthly Paycheck Calculator";

        firstName = JOptionPane.showInputDialog(null, "Please enter employee's first name", calculator,
                JOptionPane.INFORMATION_MESSAGE);
        lastName = JOptionPane.showInputDialog(null, "Please enter employee's last name", calculator,
                JOptionPane.INFORMATION_MESSAGE);
        grossPay = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter employee's gross pay", calculator,
                JOptionPane.INFORMATION_MESSAGE));

        federalTax = grossPay * .15;
        stateTax = grossPay * .035;
        socialSecurity = grossPay * .0575;
        medicare = grossPay * .0275;
        pensionPlan = grossPay * .05;
        healthInsurance = 75.00;

        netPay = grossPay - federalTax - stateTax - socialSecurity - medicare - pensionPlan - healthInsurance;

        String str = ("Monthly Paycheck of " + firstName + " " + lastName + "\nGross Pay: "
                + String.format("%.2f", grossPay) + "\nFederal Tax: " + String.format("%.2f", federalTax)
                + "\nState Tax: " + String.format("%.2f", stateTax) + "\nSocial Security: "
                + String.format("%.2f", socialSecurity) + "\nMedicare: " + String.format("%.2f", medicare)
                + "\nPension Plan: " + String.format("%.2f", pensionPlan) + "\nHealth Insurance: "
                + String.format("%.2f", healthInsurance) + "\n******************************" + "\nNet Pay: "
                + String.format("%.2f", netPay) + "\n******************************");

        String fileName = firstName + " " + lastName + " Paycheck";

        PrintWriter printWriter = new PrintWriter(fileName);
        printWriter.write(str);
        printWriter.close();

        JOptionPane.showMessageDialog(null, "Your paycheck has been saved to a file", calculator,
                JOptionPane.INFORMATION_MESSAGE);

    }

}
