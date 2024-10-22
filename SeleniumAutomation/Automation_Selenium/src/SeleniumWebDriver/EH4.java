package SeleniumWebDriver;

public class EH4 {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println(" This will be executed");
		}

	}
}
