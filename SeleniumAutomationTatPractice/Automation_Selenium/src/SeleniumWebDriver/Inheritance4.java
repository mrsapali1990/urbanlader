package SeleniumWebDriver;

public class Inheritance4 extends Inheritance3 {
	public void mul(int x, int y) {
		z = x * y;
		System.out.println("Mul:" + z);
	}

	public static void main(String[] args) {

		Inheritance4 in = new Inheritance4();
		in.add(10, 20);
		in.sub(20, 10);
		in.mul(10, 10);

	}

}
