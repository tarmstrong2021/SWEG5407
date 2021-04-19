
public class Rectangle {

	
	private double length;
	private double width;
	
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	
	public Rectangle(double l, double w)
	{
		setDimension(l,w);
		
	}
	
	public void setDimension(double l, double w)
	{
		
		length = l;
		width = w;
		
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	
	public double area()
	{
		return length * width;
		
	}
	
	public double perimeter()
	{
		return 2*(length + width);
		
	}
	
	public String toString()
	{
		return ("\nLength =  " + length + "\nWidth = " + width + "\nArea = " + area() + "\nPerimeter = " + perimeter());
		
	}
}
