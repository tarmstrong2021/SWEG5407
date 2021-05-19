package SIS;

import java.util.List;

public class Student {
	private String fName;
	private String lName;
	private String email;
	private String DOB;
	private List<Course> courses;

	public Student() {

	}

	// overloaded constructor
	public Student(String fName, String lName, String email, String dOB, List<Course> courses) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		DOB = dOB;
		this.courses = courses;
	}

	
	// method to add a course for a student
	public void addCourse(Course course) {
		courses.add(course);

	}

	// method to drop a course for a student
	public void dropCourse(Course course) {

		courses.remove(course);

	}

	public List<Course> getCourses() {

		return courses;

	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getEmail() {
		return email;
	}

	public String getDOB() {
		return DOB;
	}

	// override toString() method
	public String toString() {

		String str;
		// checks if student is enrolled in any courses
		if (courses.size() > 0) {
			// creates string variable
			str = fName.trim() + " " + lName.trim() + "\nEmail address: " + email.trim() + "\nDate of birth: " + DOB

					+ "\nCurrent Courses: \n";

			// iterate through list and display course at index[i] for all courses in list
			for (int i = 0; i < courses.size(); i++) {
				// appends courses to string
				str += courses.get(i).getCourseName() + " " + courses.get(i).getCourseID() + "\n";

			}
		}

		else
			// if student is not enrolled in courses, display message
			str = fName.trim() + " " + lName.trim() + "\nEmail address: " + email.trim() + "\nDate of birth: "
					+ DOB.trim()

					+ "\nis not registered for any classes";

		return str;

	}

}
