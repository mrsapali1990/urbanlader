package JavaAssignment;

import java.util.Scanner;

public class Assign2 {

   public static void main(String[] args) {
        
        // Create scanner class object
        Scanner in = new Scanner(System.in);

        // Input two numbers from user
        System.out.println("Enter first number :");
        double num1 = in.nextInt();
        System.out.println("Enter second number :");
        double num2 = in.nextInt();
        

        // Perform arithmetic operations.
       double sum 		= num1 + num2;
        double difference 	= num1 - num2;
       double product 	= num1 * num2;
      double quotient	= num1 / num2;
        double modulo	    = num1 % num2;
        

        // Print result to console.
        System.out.println("Sum : "         + sum);
        System.out.println("Difference : "  + difference);
        System.out.println("Product : "     + product);
        System.out.println("Quotient : "    + quotient);
        System.out.println("Modulo : "      + modulo);
    }
}