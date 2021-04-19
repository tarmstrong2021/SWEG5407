
public class FullTimeEmployee extends Employee {

	//child to employee class
	//call super.calculatePay() and add 15000 bonus on top of annual pay
	//everything else is the same
	private double bonus;
	
	public FullTimeEmployee ()
	{
		super();
	}
	
	public FullTimeEmployee (String name, String id, int hours)
	{
		super (name, id, hours);
		
	}
	
	public double calcPay() {
		
		return super.calcPay()+15000;
			
	}
	

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String toString()
	{
		return super.toString() + "\nFull Time Employee";
	}
	
	
}
