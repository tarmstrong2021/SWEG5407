package SIS;

import java.util.List;
import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Instructor Bama = new Instructor("Bama Govindaraja", "bama@fairfield.edu", "123");
	//	Instructor Steve = new Instructor("Steve Smith", "steve@fairfield.edu", "789");
		
		Course Bio = new Course("Biology", 101/*, Steve, 25*/);
		Course CompSci = new Course("Computer Science", 202/*,Bama, 20*/);
		
		List<Course> tomList = new ArrayList<>();
		tomList.add(Bio);
		
		
		Student tom = new Student("Tom", "Armstrong", "tarmstrong@student.fairfield.edu", "1-22-85",tomList);

		tom.addCourse(CompSci);
		
		System.out.println(tom.toString());
		
		tom.dropCourse(CompSci);
		
		System.out.println(tom.toString());
	}

}
