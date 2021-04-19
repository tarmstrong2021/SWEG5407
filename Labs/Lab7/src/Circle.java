
public class Circle {

	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		double area_Circle = 3.14 * radius * radius;

		return area_Circle;
	}

	public double perimeter() {

		double perimeter_Circle = 2 * 3.14 * radius;

		return perimeter_Circle;

	}
	
	public String toString() {
		
		String str =  "The area of the circle is " + this.area() + " and the perimeter of the circle is " + this.perimeter();
		
		return str;
		
	}
}
