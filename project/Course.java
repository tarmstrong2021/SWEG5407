package SIS;

public class Course {

	private String courseName;
	private int courseID;

	public Course() {

	}

	//overloaded constructor
	public Course(String courseName, int courseID) {

		this.courseName = courseName;
		this.courseID = courseID;

	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}


	// override equals() method to compare input from Jframe to objects in list
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseID != other.courseID)
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		return true;
	}

}
