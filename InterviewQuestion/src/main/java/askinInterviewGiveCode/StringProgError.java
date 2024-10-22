package askinInterviewGiveCode;

public class StringProgError {
	public static void main(String[] args) {


		String s1 = "User";
		String s2 = "User";
		String s3 = new String("User");

		System.out.println(s1 == s2);//true because both reference variable reffer to the same string
		System.out.println(s1 == s3);//false
		System.out.println(s1.equals(s2));//true content is same;
		//String input = "This is a TimeBound Test"

		//output = "sihT si a dnuoBemiT tseT"
	}
}
