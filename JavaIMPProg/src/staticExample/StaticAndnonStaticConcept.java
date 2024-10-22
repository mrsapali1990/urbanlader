package staticExample;

public class StaticAndnonStaticConcept 
{
	//global vars:the scope of global vars will be available across all the functions and some conditions
	String name="Tathagat";//non static global variable
	static int age=35;//static global variable
	int b=10;
	public void abc()
	{
		int a=10;
		System.out.println(age);
		
	}


	public static void main(String[] args) 
	{
		//how to call static methodes and vars?
		//1.direct calling:
		
		sum();
		//2.by calling by class name
		StaticAndnonStaticConcept.sum();
		System.out.println(age);//1
		System.out.println(StaticAndnonStaticConcept.age);//2

		//how to call non static methode and variable
		StaticAndnonStaticConcept obj=new StaticAndnonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		//can i access methode by using object reference?yes
		obj.sum();//warning will given

	}
	public void sendMail()//non static methode
	{
		System.out.println("sendmail methode");
	}
	public static void sum()// static methode
	{

		System.out.println("sum methode");
	}
}

