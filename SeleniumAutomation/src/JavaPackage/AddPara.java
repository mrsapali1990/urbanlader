package JavaPackage;

public class AddPara {

	public static void main(String[] args) 
	{
		sum(10,20);
		ByObjetAdd obj=new ByObjetAdd();//Here BYObjectAdd is a class written sepretally
		obj.sumOne(40,50);//call that class pass value

	}
	public static void sum(int a,int b)
	{  
		//int a=10;
		//int b=20;
		System.out.println("Valuve of a"+a);
		System.out.println("Valuve of b"+b);
		int addNumber=a+b;
		System.out.println("Valuve of Addition:    "+addNumber);
	}
}
