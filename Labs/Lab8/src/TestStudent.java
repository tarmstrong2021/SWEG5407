import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner console = new Scanner(System.in);
		Student[] studentArray = new Student[3];
		
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println("Please enter the students name");
			String name = console.next();
			System.out.println("Please enter the students ID");
			String id = console.next();
			
			
			int[] scores = new int[3];
			for (int j = 0; j < scores.length; j++) {
				System.out.println("Please enter the students score");
				scores[j] = console.nextInt();
			}
			
			studentArray[i] = new Student(name, id, scores);
		}
		
		System.out.println("Please enter the name of the student who's information you want to display");
		
		String stu = console.next();
		
		
		int position = -1;
		for (int i = 0; i < studentArray.length; i++) {

			if (studentArray[i].getName().equals(stu)) {
				position = i;
			}
		}
		
		if (position == -1) {

			System.out.println("That student can't be found");
		} else {
			System.out.println(studentArray[1].toString());
		}

	}

}
