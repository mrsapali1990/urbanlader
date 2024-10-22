package SeleniumWebDriver;

public class Methodoverload7 {
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sum(long a,long b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Methodoverload7 m7=new Methodoverload7();
		m7.sum(10l, 20);
		m7.sum(20l, 20);
	}

	
}
