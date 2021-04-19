
public class MethodDemo1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call square
        MethodDemo1 objMethodDemo1 = new MethodDemo1();
		int res = objMethodDemo1.square(10);
		
		System.out.println("Square of a number is " + res);
		
		System.out.println(Math.pow(10, 2));
		
		//call larger
		int max = objMethodDemo1.larger (50,70);
		System.out.println("The larger number is " + max);
		
		//call playDice
		int guess = objMethodDemo1.playDice(10);
		System.out.println("Numer of times played to get sum as 10 is " + guess);
		
		//call isPalindrome
		if (objMethodDemo1.isPalindrome("qwerewqa") == true)
			System.out.println("It is a palindrome!");
		else
			System.out.println("It is not a palindorme!");
	
		//call welcome message
		objMethodDemo1.welcomeStudent("Mike");
		objMethodDemo1.welcomeStudent("Mike", "Tom");
		
		//calculateGrade objcalculateGrade = new calculateGrade();
		char res1 = objMethodDemo1.letterGrade(85.0);
		System.out.println(res1);
	
		
	}

}
