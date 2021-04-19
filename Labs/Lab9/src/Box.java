
public class Box extends Rectangle {
	
	private double height;
	
	public Box()
	{
		super();
		height = 0;
	}
	
	public Box(double l, double w, double h)
	{
		super(l,w);
		height = h;

	}

	public void setDimension(double l, double w, double h)
	{
		
		super.setDimension(l, w);
		height = h;		
		
	}

	public double getHeight() {
		return height;
	}
	
	public double area()
	{
		return 2*((getHeight()*getWidth())+ ((getHeight()* getLength()) + (getWidth()* getLength())));
		
		
	}
	
	public double volume()
	{
		return (getHeight()*getLength()*getWidth());
	}

	public String toString( ) {
		
		return ("\nLength =  " + getLength() + "\nWidth = " + getWidth() + "\nHeight = " + height + "\nSurface Area = " + area() + "\nvolume = " + volume());
				
		
		
		
	}

}


