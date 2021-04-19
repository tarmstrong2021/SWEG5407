
public class AccessShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//rect object using default constructor
		Rectangle rect1 = new Rectangle();
		rect1.setDimension(10.4, 12.5);
		
		System.out.println(rect1.toString());
		
		//rect object using the second constructor
		
		Rectangle rect2 = new Rectangle(10.4, 12.5);
		System.out.println(rect2.toString());
		
		
		//box object using default constructor
		
		Box box1 = new Box();
		box1.setDimension(5.1, 3.2, 10);
		
		System.out.println(box1.toString());
		
		
		//box object using second constructor
		
		Box box2 = new Box(5.1, 3.2, 10); 
		
		System.out.println(box2.toString());
		
	}

}
