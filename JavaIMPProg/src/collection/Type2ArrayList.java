package collection;

import java.util.ArrayList;

public class Type2ArrayList {
//variable length collection class
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("tathagat");
		al.add("maliikarjub");
		al.add("jalinder");
		
		for(String obj:al)
			//for(datatype variablename:arrayname)
		{
			System.out.println(obj);
			
		}
		System.out.println(al.indexOf("tathagat"));
	}
}
