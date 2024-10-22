package InterviewQuestion.InterviewQuestion;

public class MiddleOdCharOfString {

	public static void main(String[] args) {
		String str = "helolo";
		int length = str.length();
		int middleIndex = length / 2;

		if (length % 2 == 1)
		{
			// For odd length strings, return the middle character
			System.out.println(Character.toString(str.charAt(middleIndex)));
		} 
		else 
		{
			// For even length strings, return the two middle characters
			System.out.println(str.substring(middleIndex - 1, middleIndex + 1));
		}
	}

}


