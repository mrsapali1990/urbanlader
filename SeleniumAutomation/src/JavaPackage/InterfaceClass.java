package JavaPackage;

public class InterfaceClass implements Interface1{


	public void a() {

		System.out.println("This is interface......");
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) 
	{

		Interface1 if1=new InterfaceClass();
		if1.a();
	}
}
