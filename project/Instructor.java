package SIS;

public class Instructor {
	
	private String instructorName;
	private String instructorEmail;
	private String instructorId;
	
	public Instructor() {
		
	}

	public Instructor(String instructorName, String instructorEmail, String instructorId) {
		
		this.instructorName = instructorName;
		this.instructorEmail = instructorEmail;
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	
	
}

	
	