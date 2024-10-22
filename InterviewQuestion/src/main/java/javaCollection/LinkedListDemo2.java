package javaCollection;

import java.util.LinkedList;

import org.apache.poi.util.SystemOutLogger;

import edu.emory.mathcs.backport.java.util.Collections;

public class LinkedListDemo2 {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("x");
	l.add("y");
	l.add("z");
	l.add("a");
	l.add("b");
	l.add("c");
	
	LinkedList new_l=new LinkedList();
			new_l.addAll(l);
			System.out.println(new_l);//[x, y, z, a, b, c]

			new_l.removeAll(l);//[]
			System.out.println(new_l);
	//sort() collection.sort(collection)
	System.out.println("Before sorting"+l);
	Collections.sort(l);
	System.out.println(l);
	//reverse order
	Collections.sort(l,Collections.reverseOrder());
	System.out.println("reverse order"+l);
	//shuffling()
	Collections.shuffle(l);
	System.out.println(l);
}
}
