import javax.swing.JOptionPane;

public class JOptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius;
		double area;
		
		//converts string input from user to integer
		radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius"));
		
		area = 3.14 * radius * radius;
		
		JOptionPane.showMessageDialog(null, "Area is " + area);
		

	}

}
