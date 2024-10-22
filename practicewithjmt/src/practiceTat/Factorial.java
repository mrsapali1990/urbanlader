package practiceTat;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {

		System.out.println("Enter a number for factorial");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
