
import java.util.List;

public class Institute {

	private String inst_name;
	private List<Branch> branches;

	public Institute() {

	}

	public Institute(String inst_name, List<Branch> branches) {
		
		this.inst_name = inst_name;
		this.branches = branches;
	}

	public int getAllStudentsInstitute() {

		int num = 0;
		List<Student> students;
		
		for (Branch branch : branches) {
			students = branch.getStudents();
			for (Student student : students) {
				num ++;
			}
		}

		return num;

	}

}
