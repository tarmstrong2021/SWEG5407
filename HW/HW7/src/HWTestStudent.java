import java.util.Scanner;
public class HWTestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		Student[] studentArray = new Student[2];

		for (int i = 0; i < studentArray.length; i++) {
			System.out.println("Please enter the students Name");
			String name = console.next();
			System.out.println("Please enter the students Age");
			int age = console.nextInt();
			System.out.println("Please enter the students ID");
			String id = console.next();
			System.out.println("Please enter the students Gender (Male or Female)");
			String gender = console.next();
			System.out.println("Please enter the students GPA");
			double gpa = console.nextDouble();
			
			studentArray[i] = new Student(name, age, id, gender, gpa);
		}

		for (int j=0; j<studentArray.length; j++) {
			System.out.println(studentArray[j].toString());
			
		}
		int male = 0;
		int female = 0;
		
		
		for (int k=0; k<studentArray.length; k++) {
			if(studentArray[k].getGender().equals("Male") || studentArray[k].getGender().equals("male")) {
				male++;
			}else female++;
		}
		
		System.out.println("The female to male ratio is " + female + ":" + male);
	}
}

