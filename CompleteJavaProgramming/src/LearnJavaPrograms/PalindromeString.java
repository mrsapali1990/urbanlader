package LearnJavaPrograms;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		System.out.println("Enter String             ");
		
		Scanner s =new Scanner(System.in);
		String x=s.nextLine();//amar=4
		String y="";
		String orignal=x;
		for(int i=x.length()-1;i>=0;i--)
		{
			y=y+x.charAt(i);//Amar
		}
		if(orignal.equals(y))
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
	} 
	

}
