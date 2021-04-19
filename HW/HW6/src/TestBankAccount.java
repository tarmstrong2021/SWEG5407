import java.io.FileNotFoundException;


public class TestBankAccount {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

//		
		BankAccount objBankAccount = new BankAccount();
		objBankAccount.deposit(50000, "Mike");
		objBankAccount.withdraw(100, "Mike");

		double balance = objBankAccount.getBalance("Mike");

		System.out.println(balance);

	}

}
