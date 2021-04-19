import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		int r;

		// Array Format - DataType[] arrayName = new DataType[length];
		 //Circle[] circleArray = new Circle[5];
		
		ArrayList<Circle> circleList = new ArrayList<Circle>();
		String option;
		

		do {
			System.out.println("Enter radius");
			r = console.nextInt();
			//circleArray[i] = new Circle(r);
			
			Circle circle = new Circle (r);
			circleList.add(circle);
			System.out.println("Do you want to add another element (yes/no)?");
			option = console.next();

		}while (option.equals("yes"));

			for (Circle circle : circleList) {
				System.out.println(circle.area());
			}
	}

}
