
import java.util.Scanner;

public class MidtermCircleArea {
	public static void main(String[] args) {
		
		
		double radius, area;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter radius");
		
		while (console.hasNextDouble()) {
		radius = console.nextDouble();
		
		if(radius <0) {
			System.out.println("Please enter a valid radius: ");
		}else {
			area = 3.14 * radius * radius;	
			System.out.println("area:  " + area);
			break;
	}
}}}
