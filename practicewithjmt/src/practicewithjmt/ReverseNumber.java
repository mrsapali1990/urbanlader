package practicewithjmt;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rev=0,rem;
		System.out.println("Enter a number  for reverse");
		Scanner sc=new Scanner (System.in);
		
		int n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);

	}

}
