
public class Student {

	private String name;
	private String id;
	private int[] scores;

	public Student() {

	}

	public Student(String name, String id, int[] scores) {
		this.name = name;
		this.id = id;
		this.scores = scores;

	}

	public char calculateGrade() {
		int totalScore = 0;
		int avgScore = 0;
		char grade;

		for (int i = 0; i < scores.length; i++) {
			totalScore = totalScore + scores[i];
			avgScore = totalScore / (i + 1);
		}

		if (avgScore < 60)
			grade = 'F';
		else if (avgScore >= 60 && avgScore < 70)
			grade = 'D';
		else if (avgScore >= 70 && avgScore < 80)
			grade = 'C';
		else if (avgScore >= 80 && avgScore < 90)
			grade = 'B';
		else
			grade = 'A';

		return grade;

	}

	public String toString() {

		String str = "The grade for  " + name + " with ID # " + id + " is " + this.calculateGrade();

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

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
}
