package practicewithjmt;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,fact=1;
		System.out.println("enter a number for factorial");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=n;i>=1;i--)
			fact=fact*i;
		System.out.println(fact);

	}

}
