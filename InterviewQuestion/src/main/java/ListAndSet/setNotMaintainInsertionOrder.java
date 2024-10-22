package ListAndSet;

import java.util.HashSet;
import java.util.Set;

public class setNotMaintainInsertionOrder {

	public static void main(String[] args) {
		insertionOrderDemo();
	}
	public static void insertionOrderDemo()
	{
		Set<String> set=new HashSet<String>();
		set.add("element1");
		set.add("element2");
		set.add("element3");
		set.add("element4");
		set.add("element7");
		set.add("element5");
		set.add("element6");
		set.add("element9");
		set.add("element8");
		System.out.println(set.toString());//[element1, element2, element3, element4,
		                                //element5, element6, element7, element8, element9]

		
	}
}
