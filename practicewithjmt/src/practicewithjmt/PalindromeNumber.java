package practicewithjmt;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Enter Numuber      :");
		Scanner s=new Scanner(System.in);//121
		int num=s.nextInt();
		int r;
		int temp;
			
		temp=num;//temp=121
		int sum=0;
		while(num!=0)//(121!=0)
		{
			r=num%10;//121/10=rem1 rem2 rem=1
			sum=(sum*10)+r;//r=1//sum=1 sum=12 sum=121
			num=num/10;//num=12 num=1 num=0
			
		}
		
		if(temp==sum)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome number");
	}

}
