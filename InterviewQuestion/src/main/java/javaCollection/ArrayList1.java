package javaCollection;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;
import org.apache.poi.util.SystemOutLogger;

public class ArrayList1 {
	public static void main(String[] args) {
		//declare ArrayList
		//ArrayList al=new ArrayList();//Hetoroginious declaration allow all data
		//ArrayList <Integer> al=new ArrayList();
		//ArrayList<String> al=new ArrayList();

		//List li=new ArrayList();//list interface is parent interface of ArrayList
		ArrayList al=new ArrayList();
		al.add(123);//add element in end of the list
		al.add("tathagat");
		al.add('t');
		al.add(12.25);
		System.out.println(al);//[123, tathagat, t, 12.25]
		//size()
		System.out.println("Number of element in arraylist     "  +al.size());
		//remove element
		al.remove(2);//2 is index
		System.out.println(al);
		//	al.remove("tathagat");//here tathagat is element in arraylist
		//insert a new element add(index,element/object)
		al.add(2,"Wasnik");
		System.out.println("after insertion  "+al);
		
		//retrive the specific element by using get()
		System.out.println(al.get(2));//after insertion  [123, tathagat, Wasnik, 12.25]

		//change element or replace element 
		al.set(3,"pandurang");
		System.out.println(al);
		
		//search specific element by using contains()  return true or false
		System.out.println(al.contains("tathagat"));//true
		System.out.println(al.contains("tatha"));//false
		
		//isempty()
		System.out.println(al.isEmpty());
		//read all data from arrayList
		
		//1)for loop
		//reading elemetn for loop
//		System.out.println("reading element  using for loop");
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		
//		}
		
		
		//2)for ....each
//		System.out.println("reading element using for each loop");
//		for(Object e:al)
//		{
//			System.out.println(e);
//			
//		}
		
		//3)iterator
//		System.out.println("reading element by using eterator");
//		Iterator it=al.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		
		
		
	}

}
