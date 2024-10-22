package JavaProgram;

public class swapingNumber {

	public static void main(String[] args)
	{
		int a=10,b=20;
		System.out.println("The value Before swaping: "+a+" "+b);
		
		//first logic
		/*int t=a;
		a=b;
		b=t;*/
		
		/*second logic using addition and subtraction withaut using third variable
		a=a+b;
		b=a-b;
		a=a-b;*/
		
		//Third logic multiplication and division withaut using third variable
		//here the value of a and not zero
		a=a*b;//a=10,b=20,a*b=200;
		b=a/b;//200/10
		a=a/b;//200/20
		
		//Logic four
		
		b=a+b-(a=b);
		
		
		
		System.out.println("The value  After swaping: "+a+" "+b);

	}

}
