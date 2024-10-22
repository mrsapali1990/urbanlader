package practicewithjmt;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter a string for reversing   :");
		Scanner sc =new Scanner(System.in);
		String x=sc.next();
		String y="";
		for(int i=x.length()-1;i>=0;i--)
		{
			y=y+x.charAt(i);
			
		}
		System.out.println("reverse number is      "    +y);

	}

}
