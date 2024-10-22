package ListAndSet;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {

	public static void main(String[] args) {
		duplicateValueDemo();

	}
	
	//*********allow duplicate value *******************
	public static void duplicateValueDemo()
	{
		List<String> list=new ArrayList<String>();
		list.add("element1");
		list.add("element1");
		list.add("element2");
		System.out.println(list.toString());//[element1, element1, element2]


	}

}
