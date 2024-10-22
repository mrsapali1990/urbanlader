package InterviewQuestion.InterviewQuestion;

import java.util.LinkedHashSet;
import java.util.Set;

import edu.emory.mathcs.backport.java.util.Arrays;

public class RemoveDuplicateFromString {
	
	public static String removeDuplicateWords(String str)
	{
		String words[]=str.split("\\s+");
		//matches sequence of one or more whitespace charecter
		
		Set<String> uniqWord=new LinkedHashSet<>(Arrays.asList(words));
		String result=String.join(" ",uniqWord);
		
		return result;		
	}
	

	public static void main(String[] args)
	{
		String str="I am Nitin and I am an engineer";
		
		String result=removeDuplicateWords(str);
		
		System.out.println("Orignal String "+str);
		System.out.println("String without duplicates"+result);			
		

	}

}
