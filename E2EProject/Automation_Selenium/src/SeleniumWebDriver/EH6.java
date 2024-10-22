package SeleniumWebDriver;

public class EH6 {
	public static void eligibility(int age) {
		if (age < 18) {
			throw new ArithmeticException(" Not valid");
		} else {
			System.out.println(" Not Eligible foe votting");
		}
	}

	public static void main(String[] args) {
		eligibility(15);
	}

}
