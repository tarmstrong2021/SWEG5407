import java.util.ArrayList;
import java.util.List;

public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create lesson objects
		Lesson l1 = new Lesson("123", "Web Services", "abc");
		Lesson l2 = new Lesson("789", "GUI", "abc");
		Lesson l3 = new Lesson ("456", "CRUD", "xyz");
		Lesson l4 = new Lesson ("234", "variables", "xyz");
		
		//create Module objects
		
		List<Lesson> abcList = new ArrayList<>();
		List<Lesson> xyzList = new ArrayList<>();
		
		abcList.add(l1);
		abcList.add(l2);
		xyzList.add(l3);
		xyzList.add(l4);
		
		
		
		Module m1 = new Module("abc", "Module 1", abcList);
		Module m2 = new Module ("xyz", "Module 2", xyzList);
		
		//create course objects
		List<Module> moduleList = new ArrayList<>();
		
		moduleList.add(m1);
		moduleList.add(m2);
		
		Course java = new Course ("asd", "Bama Govindaraja", moduleList);
		
		System.out.println("The lessons under the module m1 are " + m1.getLessons());		
		
		for (Lesson lesson : abcList)
			System.out.println(lesson);
		}
		

	}


