package InterviewQuestion.InterviewQuestion;

import java.util.ArrayList;

public class ConvertArraytoArrayLIst {
	public static void main(String[] args) {
		int a [ ] = {1,2,3,4,5};
		ArrayList <Integer>list = new ArrayList<Integer>();
		for(int element : a){
		list.add(element);
		}
		System.out.println("Convert to Array To ArrayLIst  "+list);
		System.out.println("The position of two in the array  list is"+list.indexOf(3));
	}

}
