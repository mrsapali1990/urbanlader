package SeleniumWebDriver;

public class EH1 {
	public static void main(String[] args) {
		try {
			int a = 50 / 0;

		} catch (ArithmeticException a) {
			System.out.println(a);
		} catch (NullPointerException n) {
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println(" Exception Handling");
	}

}
