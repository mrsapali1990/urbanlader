package InterviewQuestion.InterviewQuestion;

public class RemoveNumberFromString {
	public static void main(String[] args) {
		String str ="a3b4c5";
		
//		String str1=str.replaceAll("[^a-z]", "");
//		System.out.println(str1);
		
		String s1="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				s1=s1+str.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
