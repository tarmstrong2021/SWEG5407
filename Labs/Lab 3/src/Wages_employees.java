import java.util.Scanner;

public class Wages_employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// gets number of hours worked in the week from the user
		// gets hourly pay
		// calculates weekly pay
		// if overtime (hours > 40), then hourly pay is 1.5 times

		// This code should run for 5 employees
		int num_hours;
		double hourly_pay;
		double weekly_pay;
		int diff_hours;

		// initialize count to be 0
		int count = 0;
		// run code while count is less than 5
		/*
		 * While Loop top tested
		 * while (count < 5) {
		 * 
		 * // initialize scanner and get number of hours worked Scanner console = new
		 * Scanner(System.in); System.out.println("Enter number of hours worked: ");
		 * num_hours = console.nextInt();
		 * 
		 * // get hourly pay System.out.println("Enter hourly pay: "); hourly_pay =
		 * console.nextDouble();
		 * 
		 * // calculation is number of hours worked is less than or equal to 40 (normal
		 * // pay) if (num_hours <= 40) { weekly_pay = num_hours * hourly_pay; //
		 * calculation if number of hours worked is greater than 40 (overtime pay) }
		 * else { diff_hours = num_hours - 40; weekly_pay = (40 * hourly_pay +
		 * diff_hours * (hourly_pay * 1.5));
		 * 
		 * } // print weekly pay System.out.println("Weekly Pay is: " + weekly_pay);
		 * 
		 * // increment count count++;
		 * 
		 * }
		 */
		
		/*
		 * do {
		 * 
		 * Scanner console = new Scanner(System.in);
		 * System.out.println("Enter number of hours worked: "); num_hours =
		 * console.nextInt();
		 * 
		 * System.out.println("Enter hourly pay: "); hourly_pay = console.nextDouble();
		 * 
		 * if (num_hours <= 40) { weekly_pay = num_hours * hourly_pay; }
		 * 
		 * else { diff_hours = num_hours - 40; weekly_pay = (40 * hourly_pay +
		 * diff_hours * (hourly_pay * 1.5)); }
		 * 
		 * System.out.println("Weekly Pay is: " + weekly_pay); count++; } while (count <
		 * 5);
		 */
		 

		
		for (int emp_count = 0; emp_count < 5; emp_count++) {

			Scanner console = new Scanner(System.in);
			System.out.println("Enter number of hours worked: ");
			num_hours = console.nextInt();

			System.out.println("Enter hourly pay: ");
			hourly_pay = console.nextDouble();

			if (num_hours <= 40) {
				weekly_pay = num_hours * hourly_pay;
			}

			else {
				diff_hours = num_hours - 40;
				weekly_pay = (40 * hourly_pay + diff_hours * (hourly_pay * 1.5));
			}

			System.out.println("Weekly Pay is: " + weekly_pay);

		}

}
}

