import java.util.List;

public class Module {
	
	private String id, title;
	private List<Lesson> lessons;
	
	
	public Module() {
		
	}


	public Module(String id, String title, List<Lesson> lessons) {
	
		this.id = id;
		this.title = title;
		this.lessons = lessons;
	}


	public List<Lesson> getLessons() {
		
		for (Lesson lesson : lessons) {
			System.out.println(lesson);
		}
		
		return lessons;
	}


	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	
//	public List<Lesson> getLessons(){
//		
//		return lessons;
//	}
//	
	

}
