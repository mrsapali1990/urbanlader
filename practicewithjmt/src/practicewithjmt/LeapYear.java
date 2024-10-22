package practicewithjmt;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	System.out.println("Enter year to check leap year or not");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	if((year%400==0)||((year%4==0) &&(year%100!=0)))
			{
		System.out.println("year  "  +year+  "is leap year");
			}
	else
	{
		System.out.println("not leap year");
	}
}
}
