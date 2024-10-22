package LearnJavaPrograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter String             ");
		
		Scanner s =new Scanner(System.in);
		String x=s.nextLine();//amar=4
		String y="";
		for(int i=x.length()-1;i>=0;i--)
		{
			y=y+x.charAt(i);//Amar
		}
		System.out.println("Reverse number is       "  +y);
	}
	

}
