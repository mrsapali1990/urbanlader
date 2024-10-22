package stringmethodes;

public class CountNumberFromString {
	public static void main(String[] args) {

		String str="Tatha4654gat1234";
		str=str.replaceAll("[^0-9]", "");
		int count=str.length();
		System.out.println(count);
	}
}
