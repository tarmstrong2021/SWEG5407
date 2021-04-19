import java.util.Scanner;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create object array with String
		String[] nameArray = new String[3];
		
		//create scanner
		Scanner console = new Scanner(System.in);
		
		//"for" ctrl space creates this iteration on array (I love this shortcut!)
		for (int i = 0; i < nameArray.length; i++) {
			
			System.out.println("Enter Name: ");
			//stores next input from console at array address i
			nameArray[i] = console.next();
		}
		
		System.out.println("Printing the objects in array");
		
		//for loop prints all array objects
		for (int i = 0; i < nameArray.length; i++) {
			
			System.out.println(nameArray[i]);
		}
		
	}

}
