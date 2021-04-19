
public class Employee {

	private String empName, empId;
	private int hrs;
	
	
	public Employee ()
	{
		
	}
	
	public Employee (String name, String id, int hours)
	{
		empName = name;
		empId = id;
		hrs = hours;
		
		
	}
	
	public double calcPay()
	{
		return 12*hrs;
		
	}
	
	public String toString()
	{
		return "\nEmployee name = " + empName +  "\nEmployee ID = " + empId + "\nPay = " + calcPay();
		
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	
}
