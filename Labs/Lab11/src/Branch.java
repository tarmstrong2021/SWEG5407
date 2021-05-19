
import java.util.List;


public class Branch {

	private String branch_name;
	private List<Student> students;
	
	public Branch () {
		
	}
	
	
			
	
	public Branch(String branch_name, List<Student> students) {
		this.branch_name = branch_name;
		this.students = students;
	}




	public List<Student> getStudents() {
				
		return students;
		
		
	}


}
