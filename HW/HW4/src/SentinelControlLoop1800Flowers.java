import javax.swing.JOptionPane;

public class SentinelControlLoop1800Flowers {

	public static void main(String[] args) {

		//Declare variables
		char letter = ' ';
		String inputMessage;
		String inputString;
		String outputMessage = null;
		int count = 0;
		int length;
		

		//Get input phone number from user
		inputMessage = "Program to convert a phone number containing letters to the corresponding numeric equivalent \n"
				+ "To stop the program enter # \n" + "Enter a phone number (e.g. 1 800 FLOWERS): ";
		inputString = JOptionPane.showInputDialog(inputMessage);
		letter = inputString.charAt(count);
		String phoneNumber = " ";
		
		
		
		while (letter != '#') {
			length = inputString.length();
			
		//open do-while loop and declare string phoneNumber
		do {
			
			//open while loop for sentinel 
			
 
				//check that input is at least 7 digits (valid us phone number without area code)
				if (length >= 7 && count < length) {
					letter = inputString.charAt(count);
					switch (letter) {

					//define cases for each possible input
					case '1':
						phoneNumber = phoneNumber + "1";
						count++;
						break;

					case '0':
						phoneNumber = phoneNumber + "0";
						count++;
						break;

					case ' ':
						phoneNumber = phoneNumber + " ";
						count++;
						break;

					case '-':
						phoneNumber = phoneNumber + "-";
						count++;
						break;

					case 'A':
					case 'B':
					case 'C':
					case 'a':
					case 'b':
					case 'c':
					case '2':
						phoneNumber = phoneNumber + "2";
						count++;
						break;

					case 'D':
					case 'E':
					case 'F':
					case 'd':
					case 'e':
					case 'f':
					case '3':
						phoneNumber = phoneNumber + "3";
						count++;
						break;

					case 'G':
					case 'H':
					case 'I':
					case 'g':
					case 'h':
					case 'i':
					case '4':
						phoneNumber = phoneNumber + "4";
						count++;
						break;

					case 'J':
					case 'K':
					case 'L':
					case 'j':
					case 'k':
					case 'l':
					case '5':
						phoneNumber = phoneNumber + "5";
						count++;
						break;

					case 'M':
					case 'N':
					case 'O':
					case 'm':
					case 'n':
					case 'o':
					case '6':
						phoneNumber = phoneNumber + "6";
						count++;
						break;

					case 'P':
					case 'Q':
					case 'R':
					case 'S':
					case 'p':
					case 'q':
					case 'r':
					case 's':
					case '7':
						phoneNumber = phoneNumber + "7";
						count++;
						break;

					case 'T':
					case 'U':
					case 'V':
					case 't':
					case 'u':
					case 'v':
					case '8':
						phoneNumber = phoneNumber + "8";
						count++;
						break;

					case 'W':
					case 'X':
					case 'Y':
					case 'Z':
					case 'w':
					case 'x':
					case 'y':
					case 'z':
					case '9':
						phoneNumber = phoneNumber + "9";
						count++;
						break;

					//define default case for invalid phone number
					default:
						JOptionPane.showMessageDialog(null, "Please enter a valid phone number");
						count = 0;
						phoneNumber = "";
						inputString = JOptionPane.showInputDialog(inputMessage);
						break;
					}
					//define action if phone number is too short
				} else if (length < 7) {
					JOptionPane.showMessageDialog(null, "Please enter a valid phone number");
					count = 0;
					phoneNumber = "";
					inputString = JOptionPane.showInputDialog(inputMessage);

					//Why does this go hear? What does it do?
				} else {
					outputMessage = "The phone number you entered is: " + inputString + "\n"
							+ "The converted telephone number is: " + phoneNumber;
					break;
				}
			} while (count <= length);

			//output converted phone number
			JOptionPane.showMessageDialog(null, outputMessage, "Phone Number", JOptionPane.PLAIN_MESSAGE);
			break;

			//close do-while loop when count equals or exceeds length
		} 
	}
}
