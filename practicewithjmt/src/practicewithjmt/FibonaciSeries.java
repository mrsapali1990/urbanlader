package practicewithjmt;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.print(num1);
		
		System.out.print(num2);
		for(int i=1;i<n;i++)
		{
			num3=num1+num2;
			System.out.print(num3);
			num1=num2;
			num2=num3;
		}
	}

}
