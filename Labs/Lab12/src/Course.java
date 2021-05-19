import java.util.List;

public class Course {
	
	private String id, author;
	private List<Module> modules;
	
	public Course() {
		
	}

	public Course(String id, String author, List<Module> modules) {
		
		this.id = id;
		this.author = author;
		this.modules = modules;
	}
	
	public List<Module> getModules(){
		
		return modules;
	}
	

}
