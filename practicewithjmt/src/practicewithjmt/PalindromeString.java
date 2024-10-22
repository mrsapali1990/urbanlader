package practicewithjmt;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Enter a string     ");
		Scanner sc=new Scanner (System.in);
		String x=sc.nextLine();//tat
		String y="";
		String orignal=x;
		for(int i=x.length()-1;i>=0;i--)
		{
			y=y+x.charAt(i);//y=t y=ta y=tat

		}
		
		if(orignal.equals(y))

			System.out.println("palindrom string");
		else
			System.out.println("not palindrome string");

	}

}
