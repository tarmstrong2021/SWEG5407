
public class JavaConcepts {
	String str;
	public JavaConcepts() {
		System.out.println("I am a default constructor");
	}

	
	public JavaConcepts(String string) {
		// TODO Auto-generated constructor stub
		
		str = string;
	}


	public void mymethod()
	{
		System.out.println("Hello World " + str);
	}

}
