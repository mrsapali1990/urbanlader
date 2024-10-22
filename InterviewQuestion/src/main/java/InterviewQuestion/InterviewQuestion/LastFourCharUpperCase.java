package InterviewQuestion.InterviewQuestion;

public class LastFourCharUpperCase {

	public static void main(String[] args) {
		String str="tathagat";
		String str1=str.substring(str.length()-4);//begin index
		System.out.println(str1);
		String str2=str1.toUpperCase();
		System.out.println(str2);
		String str3=str.substring(0,str.length()-4)+str2;
		System.out.println(str3);

	}

}
