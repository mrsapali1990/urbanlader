package JavaProgram;

public class staticinstanceLocal {
static int b=20; //only one copy
int c=30; //maltiple copy created in memory
	public static void main(String[] args)
	{

		int a=10;//local variable
		staticinstanceLocal instance=new staticinstanceLocal();
		System.out.println(a);//local variable
		
		System.out.println(staticinstanceLocal.b);//by direct class name
		
		System.out.println(instance.c);//create object of class create
	}
}
