import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		int r;

		// Array Format - DataType[] arrayName = new DataType[length];
		Circle[] circleArray = new Circle[5];

		for (int i = 0; i < circleArray.length; i++) {
			System.out.println("Enter radius");
			r = console.nextInt();
			circleArray[i] = new Circle(r);

		}

		System.out.println("Which Circle?");
		int n = console.nextInt();
		
		System.out.println(circleArray[n].toString());
		
		// foreach loop - essentially means "for each object in array do this"
		//for (Circle circle : circleArray) {

			//System.out.println(circle.toString());

		//}
	}

}
