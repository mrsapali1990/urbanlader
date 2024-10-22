package SeleniumWebDriver;

public class Inheritance2  extends Inheritance1{
	public static void main(String[] args) {
		Inheritance2 in=new Inheritance2();
		int b=20;
		int c=in.a+b; // access variable of base class
		System.out.println(c);
		
	}

}
