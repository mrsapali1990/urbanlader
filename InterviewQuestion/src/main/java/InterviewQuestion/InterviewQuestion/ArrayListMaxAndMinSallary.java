package InterviewQuestion.InterviewQuestion;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;



public class ArrayListMaxAndMinSallary {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		a.add(32300);
		a.add(40);
		a.add(500);
		int min=Collections.min(a);
		int max=Collections.max(a);
		
		System.out.println(min);
		System.out.println(max);
		
	}

}
