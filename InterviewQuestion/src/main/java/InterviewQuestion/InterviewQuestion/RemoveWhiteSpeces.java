package InterviewQuestion.InterviewQuestion;

public class RemoveWhiteSpeces {
	public static void main(String[] args) {
		String str1="My name is khan";
		//using replaceall()
		String str2=str1.replaceAll("\\s", "");
		System.out.println(str2);
		
	int len=str1.split("\\s").length;
	System.out.println(len);
	}

}
