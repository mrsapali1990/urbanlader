package Introduction.Introduction;

public class MethodsDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub



		MethodsDemo d = new MethodsDemo();

		String name = d.getData();

		System.out.println(name);

		MethodsDemo2 d1 = new MethodsDemo2();

		String name1=d1.getUserData();
		System.out.println(name1);

		getData2();

	}



	public String getData()

	{

		System.out.println ("hello world");

		return "rahul shetty";

	}



	public static String getData2()

	{

		System.out.println ("hello world");

		return "rahul shetty";

	}



}