package SeleniumWebDriver;

public class Inheritance7 extends Inheritance6{
	
	String s3=s2+"  wasnik";
	int c=20+a+b;
	public static void main(String[] args) {
		Inheritance7 i7=new Inheritance7();
	System.out.println("First Inheritance a:"+i7.a);
	System.out.println("First Inheritance b:"+i7.b);
	System.out.println("First Inheritance c:"+i7.c);
	int total=i7.a+i7.b+i7.c;
	System.out.println("Total:"+total);
	System.out.println("String :"+i7.s3);
	}

}
