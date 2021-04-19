
public class Student {

		private String name;
		private String id;
		private int age;
		private String gender;
		private double gpa;
		

		public Student() {

		}

		public Student(String name, int age, String id, String gender, double gpa) {
			this.name = name;
			this.id = id;
			this.age = age;
			this.gender = gender;
			this.gpa = gpa;
			
			

		}



		public String toString() {

			String str = "Student Details --\nName:  " + name + "\nID # " + id + "\nAge " + age
					+ "\nGender: " + gender + "\nGPA: " + gpa +"\n";

			return str;

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public double getGpa() {
			return gpa;
		}

		public void setGpa(double gpa) {
			this.gpa = gpa;
		}

		
	}

