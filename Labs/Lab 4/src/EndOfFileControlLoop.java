import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class EndOfFileControlLoop {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner filereader = new Scanner(new FileReader("names"));
		
		while (filereader.hasNext())
		{
			System.out.println(filereader.next());
		}
		
		filereader.close();
		
	}

}
