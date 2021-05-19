import java.util.Scanner;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		
		int n,d;
		
		try {
		
		System.out.println("Enter Numerator: ");
		n = console.nextInt();
		
		System.out.println("Enter demoninator: ");
		d = console.nextInt();
		
		System.out.println("Numerator/Demoninator = " + n/d);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		

	}

}
