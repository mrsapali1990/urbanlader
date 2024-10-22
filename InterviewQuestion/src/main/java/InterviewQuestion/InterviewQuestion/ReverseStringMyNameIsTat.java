package InterviewQuestion.InterviewQuestion;

public class ReverseStringMyNameIsTat {
	public static void main(String[] args) {
		String str="My Name is Tat";
		String words[]=str.split("\\s");//backword
		String revStr="";
		
		//System.out.println(words.length);//total number of word in sentence
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String rewWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				rewWord=rewWord+word.charAt(j);
			}
			revStr=revStr+rewWord+" ";
		
		}
		System.out.println(revStr);
	}

}
