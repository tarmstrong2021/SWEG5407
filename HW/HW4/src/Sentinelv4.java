import javax.swing.JOptionPane;

public class Sentinelv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variables
					char letter = ' ';
					
					String inputMessage;
					String inputString;
					String outputMessage = null;
					int count = 0;
					int length;
					

					// Get input phone number from user
					inputMessage = "Program to convert a phone number containing letters to the corresponding numeric equivalent \n"
							+ "To stop the program enter # \n" + "Enter a phone number (e.g. 1 800 FLOWERS): ";
					inputString = JOptionPane.showInputDialog(inputMessage);
					letter = inputString.charAt(count);
					String phoneNumber = " ";

					while (letter != '#') {
						length = inputString.length();  
						
						do {
							
							letter = inputString.charAt(count); 
								
								switch (letter) {

								// define cases for each possible input
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

								// define default case for invalid phone number
								default:
									phoneNumber = "invalid number";
									count ++;
									break;
								}
								
							
						} while (count < length && phoneNumber != "invalid number");

						
						outputMessage = "The phone number you entered is: " + inputString + "\n"
								+ "The converted telephone number is: " + phoneNumber;
						JOptionPane.showMessageDialog(null, outputMessage, "Phone Number", JOptionPane.PLAIN_MESSAGE);
						
						count = 0;
						length = 0;
						
						
						inputMessage = "Program to convert a phone number containing letters to the corresponding numeric equivalent \n"
								+ "To stop the program enter # \n" + "Enter a phone number (e.g. 1 800 FLOWERS): ";
						inputString = JOptionPane.showInputDialog(inputMessage);
						letter = inputString.charAt(count);
						phoneNumber = " ";
						

					}
	}

}
