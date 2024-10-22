package com.studyopdeia;

import java.util.ArrayList;

public class JavaCollectionRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Name=new ArrayList<String>();
		Name.add("Tathagat");
		Name.add("Suraj");
		Name.add("Milind");
		System.out.println(Name);
		///////////Remove element
		Name.remove(1);
		System.out.println(Name);//remove
		Name.set(0, "Wasnik");//set methode is used for value replace
		System.out.println(Name);
		System.out.println(Name.get(0));//only print particular elemet
		Name.clear();
		System.out.println(Name);//clear element in least

	}

}
