import java.util.Scanner;

public class CounterLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to sum 5 numbers
		int count = 0;
		int num, sum = 0;
		Scanner console = new Scanner(System.in);

		while (count < 3) {
			System.out.println("Enter a number: ");
			num = console.nextInt();

			sum = sum + num;

			count++;

		}
		System.out.println("The sum is: " + sum);
	}
}

