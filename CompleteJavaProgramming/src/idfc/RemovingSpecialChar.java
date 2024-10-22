package idfc;

public class RemovingSpecialChar {
	public static void main(String[] args) {
		String str="tath^agat#@hgg%$ggg#";
		String newStr=str.replaceAll("[^a-zA-Z0-9]", "");
				System.out.println(newStr);
	}

}
