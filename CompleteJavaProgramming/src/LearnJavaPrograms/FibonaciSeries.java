package LearnJavaPrograms;

import java.util.Scanner;

public class FibonaciSeries {
public static void main(String[] args) {
	//0,1,2,3,4
	//0,1,1,2,3,5,8
	System.out.println("enter no");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int num1=0;
	int num2=1;
	int num3=0;
	System.out.print(num1);
	System.out.print(num2);
	for(int i=1;i<n;i++) {
		num3=num1+num2;
		System.out.print(num3);
		num1=num2;
		num2=num3;
	}
}
}
