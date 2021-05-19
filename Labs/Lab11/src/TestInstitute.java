import java.util.List;
import java.util.ArrayList;

public class TestInstitute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//student object
		Student mike = new Student("Mike", 1234, "Computer Science");
		Student tom = new Student("Tom", 2345, "Computer Science");
		Student jane = new Student("Jane", 9999, "English");
		Student martha = new Student("Martha", 8888, "English");
		Student mike2 = new Student("Mike", 1234, "English");
		
		
		//branch object
		List<Student> compSciList = new ArrayList<>();
		List<Student> englishList = new ArrayList<>();
		compSciList.add(mike);
		compSciList.add(tom);
		englishList.add(jane);
		englishList.add(martha);
		englishList.add(mike2);
		
		Branch CompSci = new Branch("Computer Science", compSciList);
		Branch English = new Branch ("English", englishList);
		
		
		//institute object
		List<Branch> branches = new ArrayList<>();
		branches.add(CompSci);
		branches.add(English);
		
		Institute fairf = new Institute("Fairfield University", branches);
		
	System.out.println("The total number of students is " + fairf.getAllStudentsInstitute());
		
	}

}
