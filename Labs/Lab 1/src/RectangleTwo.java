package MyFirstClass;

import java.util.Scanner;

public class RectangleTwo {
    public static void main(String[] args) {
        System.out.println("Find the Area of a rectangle");

        int length;
        int width;
        int area;

        System.out.println("Enter the Length of the rectangle");

        Scanner console = new Scanner(System.in);

        length =  console.nextInt();

        System.out.println("Enter the width of the rectangle");

        width = console.nextInt();

        area = length*width;

        System.out.println("The area of the rectangle is: " + area);
    }
}
