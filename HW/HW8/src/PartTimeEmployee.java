
public class PartTimeEmployee extends Employee{

	//child to employee. Only change is to override toString
	//override toString (print super.toString() and append "Part Time employee"
	//Everything else inherits from parent
	
	public PartTimeEmployee ()
	{
		super();
	}
	
	public PartTimeEmployee (String name, String id, int hours)
	{
		super(name, id, hours);
		
	}
	
	public String toString()
	{
		return super.toString() + "\nPart Time Employee";
		
	}
}
