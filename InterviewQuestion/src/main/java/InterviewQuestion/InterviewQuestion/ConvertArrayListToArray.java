package InterviewQuestion.InterviewQuestion;

import java.util.ArrayList;

public class ConvertArrayListToArray {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("java");
		arrayList.add("sql");
		arrayList.add("selenium");
		arrayList.add("testNg");
		
		String words[]=arrayList.toArray(new String[arrayList.size()]);
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		
	}

}
