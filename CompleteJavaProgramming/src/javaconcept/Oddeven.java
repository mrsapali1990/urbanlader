package javaconcept;

import java.util.Scanner;

public class Oddeven
{
public static void main(String[] args)
{
System.out.println("Enter number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}
