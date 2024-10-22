package ListAndSet;

import java.util.HashSet;
import java.util.Set;

public class setNotAllowNullValues {

	public static void main(String[] args) {
		allowNullValues();

	}
	public static void allowNullValues()
	{
		Set<String> set=new HashSet<String>();
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set.toString());//[null]
	}

}
