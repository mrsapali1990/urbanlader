package com.studyopdeia;

import java.util.ArrayList;

public class javaCollection {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<String> Name=new ArrayList<String>();
		Name.add("Tathagat");
		Name.add("Suraj");
		Name.add("Milind");
		System.out.println(Name);
		Name.add("Anish");//add element in ending
		System.out.println(Name);
		Name.add(1,"Rohit");//add element in middle 
		System.out.println(Name);
		Name.add(0,"Amir");
		System.out.println(Name);//Add element in Start
		
	}

}
