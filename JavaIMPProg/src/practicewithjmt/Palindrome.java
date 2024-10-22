package practicewithjmt;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println("Enter Numuber      :");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int r;
		int temp;
		temp=num;
		int sum=0;
		while(num!=0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
		}
		
		if(temp==sum)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome number");
	}

}
