package JavaProgram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//scanner class in java that can accsept data at run time
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value:");
				int num=sc.nextInt();
				int rev=0;
				int org_num=num;
				while(num!=0)
				{
					rev=rev*10+num%10;
					num=num/10;
				}
				
				if(org_num==rev)
				{
					System.out.println(org_num+ "     Palindrom  number");
				}
				else
				{
					System.out.println(org_num+ "     No Palindrom  number");
	}
	}
}
