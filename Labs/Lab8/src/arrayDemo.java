import java.util.Scanner;

public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s1, s2, s3, s4, s5;
//		int num = 0;
		int sum = 0;
		
		//create array called numArray - the array will allow you to store all the values entered in the for loop
		int[] numArray = new int[5];
		
		//new scanner to read input from user
		Scanner s = new Scanner(System.in);
		
		//for loop to read in 5 numbers from user. Setting this to <= will cause an array out of bounds exception
		for(int count =0; count <5; count++) {
			
			System.out.println("Enter a number");
			numArray[count] = s.nextInt();
//			num = s.nextInt();
			sum = sum + numArray[count];
		}
			
	
		//print sum of 5 numbers entered
		System.out.println("Sum = " + sum);
		
		//use "fo" cntrl-space to pull in the "for interate on array" and Eclipse will auto-generate the for statement
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		
	
	}

}
