package day6;

import java.util.ArrayList;
import java.util.Collections;

public class RetriveData1 {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>(4);
		ArrayList<String> arr1=new ArrayList<String>(4);
		arr.add(10);                      //add element in Arraylist
		arr.add(20);
		arr.add(30);
		arr.add(40);
		System.out.println(arr);
		int element=arr.get(2);             //retrive element on array list
		System.out.println(element);
		int element1=arr.remove(1);         //remove element from arraylist
		System.out.println(element1);		
		System.out.println(arr);
		arr1.add("tathagat");
		arr1.add("wasnik");
		arr1.add("pandurang");
		arr1.add("rekha colony");
		System.out.println(arr1);;
		Collections.sort(arr1);              //Sort the string or arrayList
		System.out.println(arr1);
		arr1.add(2, "Cogniwize");             //insert element on specific position
		System.out.println(arr1);
		arr1.remove(1);                       //remove element from element list
		System.out.println(arr1);
		
		
		
		
	}

}
