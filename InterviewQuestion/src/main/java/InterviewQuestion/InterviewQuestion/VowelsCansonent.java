package InterviewQuestion.InterviewQuestion;

public class VowelsCansonent {

	public static void main(String[] args) {
	String str="Automation Testing";
	int vowelCount=0;
	int cansonentCount=0;
	for(int i=0;i<str.length();i++)
	{
		Character c=str.charAt(i);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				{
					vowelCount++;
					
				}
				else
				{
					cansonentCount++;
				}
	}
	System.out.println("vowels count"+vowelCount);
	System.out.println("vowels count"+cansonentCount);
	

	}

}
