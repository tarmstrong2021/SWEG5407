

import java.io.PrintWriter;
import java.io.FileNotFoundException;


import javax.swing.JOptionPane;


public class PayCheck {

public static void main(String[] args) throws FileNotFoundException {
	// TODO Auto-generated method stub
	
  
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
    
    firstName = JOptionPane.showInputDialog(null, "Please enter employee's first name", calculator, JOptionPane.INFORMATION_MESSAGE);
    lastName = JOptionPane.showInputDialog(null, "Please enter employee's last name", calculator, JOptionPane.INFORMATION_MESSAGE);
    grossPay = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter employee's gross pay", calculator, JOptionPane.INFORMATION_MESSAGE));
    
   federalTax = grossPay *.15;
   stateTax = grossPay * .035;
   socialSecurity = grossPay * .0575;
   medicare = grossPay * .0275;
   pensionPlan = grossPay * .05;
   healthInsurance = 75.00;
   
   netPay = grossPay - federalTax - stateTax - socialSecurity - medicare - pensionPlan - healthInsurance;
   
		String str = ("Monthly Paycheck of " + firstName + " " + lastName + "\nGross Pay: " + String.format("%.2f", grossPay)
				+ "\nFederal Tax: " + String.format("%.2f", federalTax) + "\nState Tax: " + String.format("%.2f", stateTax) + "\nSocial Security: " + String.format("%.2f", socialSecurity)
				+ "\nMedicare: " + String.format("%.2f", medicare) + "\nPension Plan: " + String.format("%.2f", pensionPlan) + "\nHealth Insurance: "
				+ String.format("%.2f",healthInsurance) + "\n******************************" + "\nNet Pay: " + String.format("%.2f", netPay)
				+ "\n******************************");
		
   String fileName = firstName + " " + lastName + " Paycheck";
   
   PrintWriter printWriter = new PrintWriter(fileName);
   printWriter.write(str);
   printWriter.close();
   
   JOptionPane.showMessageDialog(null,"Your paycheck has been saved to a file", calculator,  JOptionPane.INFORMATION_MESSAGE);
 
}

}

