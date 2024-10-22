package LearnJavaPrograms;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner s =new Scanner(System.in);
		String orignal =s.nextLine();
		int length=orignal.length();
		System.out.println("Lenght of String    "   +length);
		String reverse="";
		
		for( int i=length-1;i>=0;i--)
			reverse=reverse+orignal.charAt(i);
		if(orignal.equals(reverse))
			System.out.println("entered string is palindrome");
		else
			System.out.println("Not palindrome");
		
	} 

}
