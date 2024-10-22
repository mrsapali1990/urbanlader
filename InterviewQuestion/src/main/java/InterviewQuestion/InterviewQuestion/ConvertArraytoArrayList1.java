package InterviewQuestion.InterviewQuestion;

import java.util.ArrayList;

import edu.emory.mathcs.backport.java.util.Arrays;

public class ConvertArraytoArrayList1 {
	public static void main(String[] args) {
		String words[]= {"java","textNg","selenium","sql"};
		//ArrayList<String> arrayList=new ArrayList<>();
		
		ArrayList<String> arrayList=new ArrayList<>(Arrays.asList(words));
//		for(String element:words)
//		{
//			arrayList.add(element);
//		}
		System.out.println("Array List  :"+arrayList);
	}

}
