package javaCollection;

import java.util.LinkedList;

public class LinkedListDemo3 {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("tat");
		l.add("fdf");
		l.add("tat");
		l.add("asd");
		System.out.println(l);//[tat, fdf, tat, asd]


		//addFirst()
		l.addFirst("MR");
		l.addLast("wasnik");
		System.out.println(l);//[MR, tat, fdf, tat, asd, wasnik]
		System.out.println(l.getFirst());//mr
		System.out.println(l.getLast());//wasnik
		//remove first
		l.removeFirst();
		l.removeLast();
		System.out.println("After removing first and last"+l);//[tat, fdf, tat, asd]


	}
}
