package idfc;

import java.util.Scanner;

public class PrintNumberOfWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String[] strar=str.split("");
	
	System.out.println(strar.length);
}
}
