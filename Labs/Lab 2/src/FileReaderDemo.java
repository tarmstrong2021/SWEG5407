import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileReaderDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		int basePrice = 9;
        int toppingPrice = 1;
        int total;
        double finalTotal;
        String storeName = "Joe's Pizza";
       
        
        Scanner filereader = new Scanner(new FileReader("pizza_input_file"));
        String name = filereader.next();
        
        int numOfPizzas = filereader.nextInt();
        
        int numOfToppings = filereader.nextInt();
        
        filereader.close();
        
        
       // custName = JOptionPane.showInputDialog(null, "Please enter customer's name", storeName, JOptionPane.INFORMATION_MESSAGE);
        
        //int numOfPizzas = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of Pizzas", storeName, JOptionPane.INFORMATION_MESSAGE));
        
        //int numOfToppings =  Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of Toppings", storeName,  JOptionPane.INFORMATION_MESSAGE));
        
       JOptionPane.showMessageDialog(null,"Details sent to file", storeName,  JOptionPane.INFORMATION_MESSAGE);
        
        
        total = numOfPizzas * (basePrice + (numOfToppings*toppingPrice));
        
        finalTotal = total*.85;
        
		String str = ("Customer Name: " + name + "\nNumber of Pizzas: " + numOfPizzas
				+ "\nNumber of Toppings on each pizza: " + numOfToppings + "\nTotal ($): " + total + "\nDiscount ($): "
				+ .15 * total + "\nFinal Total ($): " + finalTotal);
      
        PrintWriter printWriter = new PrintWriter("Pizza Receipt");
        printWriter.write(str);
        printWriter.close();

	}

}
