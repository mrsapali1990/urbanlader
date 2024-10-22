package LearnJavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int n,rev=0,rem;
		System.out.println("Enter a number for reverse");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n!=0)
		{
//			reverse=reverse *10;
//			reverse=reverse +n%10;//rev=3,rev=2,rev=1
//			n=n/10;//n=12,n=1,
			rem=n%10; //n=123
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println(rev);
	}
}
