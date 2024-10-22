package JavaProgram;

import java.util.Scanner;

public class PalindromStringSelf {

	public static void main(String[] args) 
	{
		String a,b="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String");
		a=sc.nextLine();
		int n=a.length();
		for(int i = n - 1; i >= 0; i--)
		{
			b = b+a.charAt(i);// b = b + a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Palindrom String");
		}
		else
		{
			System.out.println("Not Palindrom String");
		}
	}

}
