package ListAndSet;

import java.util.ArrayList;
import java.util.List;

public class ListMaintainInsertionOrder {

	public static void main(String[] args) {
		insertionOrderDemo();

	}
	//maintain insertion order
	public static void insertionOrderDemo()
	{
		List<String> list=new ArrayList<String>();
		list.add("element1");
		list.add("element1");
		list.add("element2");
		list.add("element4");
		list.add("element5");
		list.add("element7");
		list.add("element6");
		list.add("element8");
		list.add("element9");
		System.out.println(list.toString());//[element1, element1, element2, element4, element5, element7, element6, element8, element9]



	}

}
