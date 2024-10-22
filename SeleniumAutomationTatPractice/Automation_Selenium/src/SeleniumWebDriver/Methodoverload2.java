package SeleniumWebDriver;

public class Methodoverload2  extends Methodoverload1{
	public void sum(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	public static void main(String[] args) {
		Methodoverload2 mh1=new Methodoverload2();
		mh1.sum(10, 20);
		mh1.sum(20, 20, 20);
		mh1.sum(1, 10, 10, 10);

	}
	

}
