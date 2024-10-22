package InterviewQuestion.InterviewQuestion;

import java.util.HashSet;

import edu.emory.mathcs.backport.java.util.Arrays;

public class RemoveAllDuplicatesFromArrays {

	public static void main(String[] args) {
		int arr[]= {2,5,7,8,9,2,3,5,5};
		//convert array to the HashSet remove duplicates
		HashSet<Integer> set=new HashSet<Integer>();
		for(int num:arr)
		{
			set.add(num);
			
		}
		System.out.println("set with unique"+set);
		
	//convert HashSet back to array
		int result[]=new int[set.size()];
		int index=0;
		for(int num:set)
		{
			result[index++]=num;
			
		}
	System.out.println("Array with duplicates   : "+Arrays.toString(arr));
	System.out.println("Array with without duplicates   : "+Arrays.toString(result));
	
	
	}
	
	
	
}
