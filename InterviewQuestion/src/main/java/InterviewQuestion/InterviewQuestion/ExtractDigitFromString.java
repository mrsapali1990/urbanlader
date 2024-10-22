package InterviewQuestion.InterviewQuestion;

public class ExtractDigitFromString {
	public static void main(String[] args) {
		String str="tat w97asnik 1234 pandurang";
		int len=str.length();
		String num="";
		for(int i=0;i<len;i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num=num+str.charAt(i);
			}
		}
		System.out.println("Digits from Senetence       "+num);
	}

}
