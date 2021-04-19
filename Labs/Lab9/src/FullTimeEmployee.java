
public class FullTimeEmployee extends Employee {

	//child to employee class
	//call super.calculatePay() and add 10% bonus on top of weekly pay
	//everything else is the same
	private double bonus;
	
	public FullTimeEmployee ()
	{
		super();
	}
	
	public FullTimeEmployee (String f, String l, int id, double hours, double pay)
	{
		super (f, l, id, hours, pay);
		
	}
	
	public double calcPay() {
		
		return super.calcPay()+calculateBonus();
			
	}
	
	public double calculateBonus()
	{

		return super.calcPay()*.1;
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String toString()
	{
		return super.toString() + "\nFull time employee";
	}
	
	
}
