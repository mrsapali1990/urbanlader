package InterviewQuestion.InterviewQuestion;

public class EachFirstWordLetterIsCapital {
public static void main(String[] args) {
	String str="TaThagat panDurang waSnik";
	String result="";
	String words[]=str.split("\\s");
	for(String word:words)
	{
		String firstLetter=word.substring(0,1);
		String restOfWord=word.substring(1);
		String capitalizedWord=firstLetter.toUpperCase()+restOfWord.toLowerCase();
		System.out.print(capitalizedWord+" ");
		result=result+capitalizedWord+" ";
		
	}
	System.out.println(result.trim());
}
}
