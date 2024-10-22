package tatJavaPractice;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a Number for Palindrome or Not");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n!=0)
		{
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("Not Palindrome ");
		}
	}

}
