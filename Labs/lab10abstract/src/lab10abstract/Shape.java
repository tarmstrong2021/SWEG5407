package lab10abstract;

public abstract class Shape {

	
	//class defined as abstract means one or more method in the class is abstract 
	//can have abstract and concrete methods
	//can have as many abstract methods as you want (including no abstract methods - only concrete methods)
	//if you have any abstract methods, the class must be abstract
	//can not be instantiated, can only be inherited. 
	
	public abstract void calculateArea(int a); //need to explicitly name method as abstract (public ABSTRACT void)
	
	public String toString()
	{
		return "From concrete method";
	}
	
}
