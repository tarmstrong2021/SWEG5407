
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Employee emp1 = new Employee("Tom", "Armstrong", 1234, 35, 20.0);
//		System.out.println(emp1.toString());
		
//		PartTimeEmployee pt1 = new PartTimeEmployee ("Patrick", "Lapin", 9876, 20, 25);
//		System.out.println(pt1.toString());
//		
//		
//		FullTimeEmployee FT1 = new FullTimeEmployee ("Bama", "Govindaraja", 9999, 40, 200);
//		System.out.println(FT1.toString());
//		
//		Employee emp1 = new PartTimeEmployee ("Patrick", "Lapin", 9876, 20, 25);
//		System.out.println(emp1.toString());
		
//		Employee emp1 = new FullTimeEmployee ("Bama", "Govindaraja", 9999, 40, 200);
//		System.out.println(emp1.toString());
		
		FullTimeEmployee emp2 = new FullTimeEmployee ("Tom", "Armstrong", 8888, 40, 25);
		System.out.println(emp2.toString());
		
		//check is emp2 is instance of Employee Class
		if (emp2 instanceof Employee)
			System.out.println("Yes");
		else 
			System.out.println("No");
	}

}
