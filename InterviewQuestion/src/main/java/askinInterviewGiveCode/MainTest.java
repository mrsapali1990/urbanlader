package askinInterviewGiveCode;

public class MainTest {
	public static void main(String args[])
	{		
		//A a = new B();
		A a1 = new A();
		//B b1 = new A();

		a.printA(); //E 
		a.printB();
		a1.printA();//IN PRINTA
		a1.printB();//
		b1.printA();
		b1.printB();
	}

	class A{

		public void printA(){
			System.out.println("In printA");
		}}
	class B extends MainTest
	{
		public void printB(){
			System.out.println("In printB");
		}
	}
}
