package com.studyopdeia;

import java.util.LinkedList;

public class Linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> Name=new LinkedList<String>();
		Name.add("Tathagat");
		Name.add("Suraj");
		Name.add("Milind");
		System.out.println(Name);
		Name.addFirst("Rohit");//Add element to the start in doublylink list
		System.out.println(Name);
		Name.addLast("Amit");
		System.out.println(Name);//Add element to the last
		Name.add(3,"Anish");
		System.out.println(Name);//add element in middle
	}

}
