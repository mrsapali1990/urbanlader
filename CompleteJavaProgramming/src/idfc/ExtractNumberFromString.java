package idfc;

public class ExtractNumberFromString {

	public static void main(String[] args) {
		String str="Tathagat1234";
		String digits=str.replaceAll("[^0-9]", "");
		System.out.println(digits);

	}

}
