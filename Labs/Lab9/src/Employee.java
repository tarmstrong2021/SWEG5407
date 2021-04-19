
public class Employee {

	//private variables can only be accessed through the class
	private String fname, lname;
	private int id;
	private double numHoursWorked, hourlyPay;
	
	//protected variables directly accessible to child classes
	protected int x;
	
	
	public Employee ()
	{
		
	}
	
	public Employee (String f, String l, int id, double hours, double pay)
	{
		fname = f;
		lname = l;
		this.id = id;
		numHoursWorked = hours;
		hourlyPay = pay;
		
	}
	
	public double calcPay()
	{
		return numHoursWorked * hourlyPay;
		
	}
	
	public String toString()
	{
		return "\nEmployee first name = " + fname + "\nEmployee last name = " +lname + "\nEmployee ID = " +id + "\nPay = " + calcPay();
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNumHoursWorked() {
		return numHoursWorked;
	}

	public void setNumHoursWorked(double numHoursWorked) {
		this.numHoursWorked = numHoursWorked;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
}
