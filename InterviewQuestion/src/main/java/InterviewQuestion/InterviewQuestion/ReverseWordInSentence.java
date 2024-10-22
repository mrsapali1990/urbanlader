package InterviewQuestion.InterviewQuestion;

public class ReverseWordInSentence {
	//"hellow word"
	//wolleh drow
	
	public static void main(String[] args) {
		
		//reverse word without change position
		String str="hellow word fgdfg fgdfg";
		String words[]=str.split("\\s");//hellowword//remove spaces between words
		String revStr="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String revWord="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord=revWord+word.charAt(j);
			}
			
			revStr=revStr+revWord +" ";
		}
		System.out.println(revStr);
	}

}
