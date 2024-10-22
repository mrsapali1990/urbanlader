package com.studyopdeia;

import java.sql.Ref;

public class instancestaticlocal 
{
//1>Instance Variable :-A variable which is declare inside the class but outside of
	//all the method  called instance variable.instance variable acsess using  object reference
//2>local variable-a variable which is declare inside the body of the method parameter called local variable
//3>static:-a variable declare with the help of static keyword called static variable.static int x;
	//static variable is class variable,create single copy of that variable.life time pure program tak
	static int b=20;//static
	int c=30;//instance
	public static void main(String[] args)
	
	{
		int a=10;//local varible
		instancestaticlocal ref=new instancestaticlocal();
		System.out.println(a);
		System.out.println(instancestaticlocal.b);
		System.out.println(ref.c);

	}

}
