import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class BankAccount {

	public double getBalance(String custName) throws FileNotFoundException {

	
		// read input file
		Scanner filereader = new Scanner(new FileReader(custName));
		filereader.next();
		double balance = Double.parseDouble(filereader.next());

		// return balance
		return balance;

	}

	public void deposit(double amount, String custName) throws FileNotFoundException {

		// call getBalance
		BankAccount objBankAccount = new BankAccount();
		
		// add amount to customer balance
		double newBalance = (objBankAccount.getBalance(custName)) + amount;
	

		// update file with new balance amount
		String str = custName + "\n" + Double.toString(newBalance);
		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter(custName);
			printWriter.write(str);
			printWriter.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void withdraw(double amount, String custName) throws FileNotFoundException {

		// call getBalance
		BankAccount objBankAccount = new BankAccount();
		// subtract amount from customer balance
		double newBalance = (objBankAccount.getBalance(custName)) - amount;

		// update file with new balance amount
		String str = custName + "\n" + Double.toString(newBalance);
		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter(custName);
			printWriter.write(str);
			printWriter.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
