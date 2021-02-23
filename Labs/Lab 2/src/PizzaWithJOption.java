/*      Write a Java program for a pizza shop.
        The Pizza shop sells only individual size pizza.
        There is an offer going on in the shop.
        There is a 15% off on the total.
        Price of the individual pizza is $9 and you can hard code it in the program.
        Price of the individual topping is $1 and you can hard code it in the program.
        Your program should ask the user to enter the customer's name
        Your program should ask the user to enter the number of pizzas, the customer wants to buy..
        Your program should ask the user to enter the number of toppings. (number of toppings is same on all pizzas) using JOPtion
        Your program should calculate the total price.
        You program should print the details. See the sample below that has  right calculation using JOPtion
        ****Welcome to Joe's Pizza shop************
        Customer name : Bama Govindaraja
        Number of Pizzas = 5
        Number of toppings on each pizzas : 3
        Total($) : 60
        Discount($): 9
        Final Total($):51
        ******* Have a great day********************

 */

import javax.swing.JOptionPane;

public class PizzaWithJOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      
        int basePrice = 9;
        int toppingPrice = 1;
        int total;
        double finalTotal;
        String storeName = "Joe's Pizza";
        
        String custName = JOptionPane.showInputDialog(null, "Please enter customer's name", storeName, JOptionPane.INFORMATION_MESSAGE);
        
        
        int numOfPizzas = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of Pizzas", storeName, JOptionPane.INFORMATION_MESSAGE));
        int numOfToppings =  Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of Toppings", storeName,  JOptionPane.INFORMATION_MESSAGE));
        
        total = numOfPizzas * (basePrice + (numOfToppings*toppingPrice));
        
        finalTotal = total*.85;
        
        JOptionPane.showMessageDialog(null,  "Customer Name: " + custName +
        		"\nNumber of Pizzas: " + numOfPizzas +
        		"\nNumber of Toppings on each pizza: " + numOfToppings +
        		"\nTotal ($): " + total + 
        		"\nDiscount ($): " + .15*total + 
        		"\nFinal Total ($): " + finalTotal, 
        		storeName, JOptionPane.INFORMATION_MESSAGE);
  

	}

}
