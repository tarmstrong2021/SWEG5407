import java.util.Scanner;

public class SentinelLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to sum 5 numbers

		int num = 0, sum = 0;
		int sentinel = -999;
		Scanner console = new Scanner(System.in);

		while (num != sentinel) {

			sum = sum + num;

			System.out.println("Enter a number: ");

			num = console.nextInt();

		}
		System.out.println("The sum is: " + sum);
	}

}
