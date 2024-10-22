package LearnJavaPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int n,fact=1;
		System.out.println("Enter an integer value for calculate factorial");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
//			for(int i=1;i<=n;i++)
				for(int i=1;i<=1;i++)
				fact=fact*i;//1,2,6,24
			System.out.println("Factorial of number     "  +fact);
		
	}

}
