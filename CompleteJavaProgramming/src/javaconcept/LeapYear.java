package javaconcept;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter year for checking leap  year or not");
		System.out.println();
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		if ((year % 400==0) || ((year % 4==0) && (year % 100!=0)))
		{
			System.out.println("Year " + year +  "is leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}

}
