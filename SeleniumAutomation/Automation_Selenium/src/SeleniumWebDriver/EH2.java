package SeleniumWebDriver;

public class EH2 {
	public static void main(String[] args) {
		try{
			String s = null;
			System.out.println(s.length());
		}catch (NullPointerException n) {
			n.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
			// System.out.println(e);
		}
		System.out.println(" handling Exception");
	}

}
