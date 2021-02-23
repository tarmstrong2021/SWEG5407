import java.util.Scanner;

public class BooleanControlLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int randomNumber = (int) (Math.random() * 100);
		int guess;
		boolean guessed = false;
		int count = 0;

		Scanner console = new Scanner(System.in);

		while (!guessed) {

			System.out.println("Enter a number: ");
			guess = console.nextInt();
			count++;

			if (guess == randomNumber) {
				System.out.println("Congrats!!! You guessed it right in " + count + " guesses");
				guessed = true;
			} else if (guess < randomNumber) {
				System.out.println("Guess higher");
			} else if (guess > randomNumber) {
				System.out.println("Guess lower");
			}

		}

	}
}
