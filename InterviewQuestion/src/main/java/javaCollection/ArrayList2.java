package javaCollection;

import java.util.ArrayList;

import edu.emory.mathcs.backport.java.util.Collections;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
		
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);//[x, y, z, a, b, c]
//remove all
		al_dup.removeAll(al);
		System.out.println(al_dup);
		
		System.out.println("unsorted array"+al);
		Collections.sort(al);
		System.out.println(al);
		
		//reverse order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Revere order  :"+al);
		//shufling of element
		
		
		Collections.shuffle(al);
		System.out.println(al);
		
		
	}

}
