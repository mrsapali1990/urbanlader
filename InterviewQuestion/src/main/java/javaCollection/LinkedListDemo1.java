package javaCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	LinkedList l=new LinkedList();//accept any data hetoroginious
			//LinkedList<Integer> l=new LinkedList<Integer>();//Homoginious<Integer>wrapper class with anu=gular bracket
		LinkedList l=new LinkedList();//accept any data hetoroginious
		//add element i null list
		l.add("tathagat");
		l.add('c');
		l.add(23);
		l.add(23.43);
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		System.out.println(l.size());//6
		l.remove(3);//index
		System.out.println("after remooving   "+l);
//		l.remove('c');
//		System.out.println("direct value"+l);
		
		//insert add/delete element middle of linked list
		l.add(3,"java");
		System.out.println(l);
		//retrive value
		
		System.out.println(l.get(3));
		//change the value
		l.set(5,"python");
		System.out.println("after changing the value"+l);
		
		//conatins
		System.out.println(l.contains("java"));//true
		System.out.println(l.contains("jab"));//false
		//isempty
		System.out.println(l.isEmpty());//false
		
		//reading element from for loop
//		for(int i=0;i<l.size();i++)
//
//		{
//			System.out.println(l.get(i));
//		}
		//using for each loop
		
//		for(Object e:l)
//		{
//			System.out.println(e);
//		}
		//Iterator()
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
