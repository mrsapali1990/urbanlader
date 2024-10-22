package tatJavaPractice;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int r;
		while(n!=0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
