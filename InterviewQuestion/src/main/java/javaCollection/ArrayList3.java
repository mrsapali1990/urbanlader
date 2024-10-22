package javaCollection;

import java.util.ArrayList;

import edu.emory.mathcs.backport.java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {

		//convert array into arrayList

		String arr[]= {"tat","asc","dfd"};
		// TODO Auto-generated method stub

		for(String value:arr)
		{
			System.out.println(value);

		}
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);


	}

}
