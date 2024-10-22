package InterviewQuestion.InterviewQuestion;

public class EtractNumberFromString {
	public static void main(String[] args) {
		String str="tathagat@&%AAADSDSD1234566";
		String account=str.replaceAll("[^0-9a-z]", "");
		System.out.println("account number is :"+account);
	}

}
