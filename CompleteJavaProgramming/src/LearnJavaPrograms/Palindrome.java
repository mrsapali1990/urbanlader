package LearnJavaPrograms;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter number  :");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
//		int num=454;
		int r;
		int temp;
		temp=num;
		int sum=0;
		
		while(num!=0)
		{
			r=num%10;
			sum=(sum*10)+r;//sum=1,sum=12,sum=121
			num=num/10;//num=12,num=2
					
		}
		
		if(temp==sum)
			System.out.println("Palindrome number");
		else
			System.out.println("Not Palindrome number");
		
		 
	}
		
		
		
//		int rev;
//		int org=number;
//		
//		while(number!=0)
//		{
//			rev=rev*10+number%10;
//			number=number/10;
//		}
//		if(org==number)
//		{
//			System.out.println("Given number is palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
//
//	}
	}

