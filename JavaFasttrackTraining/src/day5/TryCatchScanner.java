package day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchScanner {

	public static void main ( String[] a )
	{
		Scanner scan = new Scanner( System.in  );
		int num ;

		System.out.print("Enter an integer: ");

		try
		{ 
			num    = scan.nextInt();      
			System.out.println("The square of " + num + " is " + num*num );
		} 

		catch ( InputMismatchException ex )
		{ 
			System.out.println("You entered bad data." );
			System.out.println("Run the program again." );
		} 

		System.out.println("Good-by" );

	}
}


