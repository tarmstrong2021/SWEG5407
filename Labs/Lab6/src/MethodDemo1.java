
public class MethodDemo1 {

	// square method
	public int square(int num) {
		int result = num * num;

		return result;

	}

	// larger method

	public int larger(int a, int b) {

		int max;
		if (a > b)
			max = a;

		else
			max = b;

		return max;

	}

	// playDice method
	public int playDice(int num) {
		int dice1;
		int dice2;
		int sum;
		int count = 0;

		do {
			dice1 = (int) (Math.random() * 6 + 1);
			dice2 = (int) (Math.random() * 6 + 1);
			sum = dice1 + dice2;
			count++;
		} while (sum != num);

		return count;

	}

	public boolean isPalindrome(String str) {

		// logic
		boolean isPal = false;
		int i, j;

		j = str.length() - 1;

		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(j)) {
				isPal = false;
				break;
			} else {
				isPal = true;
			}
			j--;

		}
		return isPal;

	}

	public void welcomeStudent(String studentName) {

		String msg = "Welcome to SW407!";
		System.out.println("Hello " + studentName + ". " + msg);

	}

	public void welcomeStudent(String studentName1, String studentName2) {

		String msg = "Welcome to SW407!";
		System.out.println("Hello " + studentName1 + " and " + studentName2 + ". " + msg);

	}
	
public char letterGrade (double num) {
		
		char finalGrade;
		
		if (num < 60)
			finalGrade = 'F';
		else if (num >= 60 && num <70)
			finalGrade = 'D';
		else if (num >=70 && num <80)
			finalGrade = 'C';
		else if (num >=80 && num <90)
			finalGrade = 'B';
		else 
			finalGrade = 'A';
		
		
		return finalGrade;
		
	}

	

}
