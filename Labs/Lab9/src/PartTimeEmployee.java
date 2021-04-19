
public class PartTimeEmployee extends Employee{

	//child to employee. Only change is to override toString
	//override toString (print super.toString() and append "Employee is partime)
	//Everything else inherits from parent
	
	public PartTimeEmployee ()
	{
		super();
	}
	
	public PartTimeEmployee (String f, String l, int id, double hours, double pay)
	{
		super(f, l, id, hours, pay);
		
	}
	
	public String toString()
	{
		return super.toString() + "\nPart time employee";
		
	}
}
