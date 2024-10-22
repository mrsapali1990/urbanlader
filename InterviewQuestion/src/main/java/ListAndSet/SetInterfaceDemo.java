package ListAndSet;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		duplicateValueDemo();

	}
	//*************did not allow duplicate value
	public static void duplicateValueDemo()
	{
		Set<String> set=new HashSet<String>();
		set.add("element1");
		set.add("element1");
		set.add("element2");
		System.out.println(set.toString());//[element1, element2]

		
	}

}
