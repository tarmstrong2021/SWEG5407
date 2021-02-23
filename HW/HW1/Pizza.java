/*      Write a Java program for a pizza shop.
        The Pizza shop sells only individual size pizza.
        There is an offer going on in the shop.
        There is a 15% off on the total.
        Price of the individual pizza is $9 and you can hard code it in the program.
        Price of the individual topping is $1 and you can hard code it in the program.
        Your program should ask the user to enter the customer's name
        Your program should ask the user to enter the number of pizzas, the customer wants to buy..
        Your program should ask the user to enter the number of toppings. (number of toppings is same on all pizzas)
        Your program should calculate the total price.
        You program should print the details. See the sample below that has  right calculation:
        ****Welcome to Joe's Pizza shop************
        Customer name : Bama Govindaraja
        Number of Pizzas = 5
        Number of toppings on each pizzas : 3
        Total($) : 60
        Discount($): 9
        Final Total($):51
        ******* Have a great day********************

 */

package MyFirstClass;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        String custName;
        int numOfPizzas;
        int numOfToppings;
        System.out.println(" **** Welcome to Joe's Pizza Shop **** ");

        //user scanner to get customer name
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter customer's name: ");
            custName = console.nextLine();


        //user scanner to get number of pizzas
        System.out.println("How many pizza's would you like to purchase? ");
            numOfPizzas = console.nextInt();


        //user scanner to get number of toppings per pizza
        System.out.println("How many toppings would you like on your pizzas? ");
            numOfToppings = console.nextInt();

        //calculate full cost
        int fullCost = ((9+numOfToppings)*numOfPizzas);

        //Calculate Discount
        double discount = fullCost * .15;

        // Calculate final cost
        double finalCost = fullCost - discount;


        System.out.println(" ********** Welcome to Joe's Pizza Shop! ********** ");
        System.out.println("Customer Name: " + custName);
        System.out.println("Number of Pizzas: " + numOfPizzas);
        System.out.println("Number of Toppings on each Pizza: " + numOfToppings);
        System.out.println("Full Cost: "+ fullCost);
        System.out.println("Discount: " + (int)discount);
        System.out.println("Final Cost: " + (int)finalCost);
        System.out.println("********** Have a Great Day! **********");
    }
}