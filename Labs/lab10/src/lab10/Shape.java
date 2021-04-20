package lab10;

//public modifier is optional
public interface Shape {
	
	//Interfaces are used to support multiple inheritances in Java. Classes can only have one parent
	//Interfaces only have abstract methods
	//Classes that implement interfaces, need to have all the methods (Eclipse will do this for you)
	//you can not instantiate an interface, you can only implement it
	
	public void calculateArea(int a); //abstract method - no curly braces
	
}
