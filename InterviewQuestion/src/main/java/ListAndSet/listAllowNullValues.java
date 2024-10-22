package ListAndSet;

import java.util.ArrayList;
import java.util.List;

public class listAllowNullValues {

	public static void main(String[] args) {
		allowNullValueDemo();

	}
	public static void allowNullValueDemo()
	{
		List<String> list=new ArrayList<String>();
		list.add(null);
		list.add(null);
		list.add(null);
		System.out.println(list.toString());//[element1, element1, element2]


	}

}
