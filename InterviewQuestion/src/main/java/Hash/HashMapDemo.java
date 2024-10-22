package Hash;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		//HashMap m=new HashMap();//allow heteroginius data
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		
		//HashMap<Integer,String> m=new HashMap ();
		m.put(101, "tathahagt");
		m.put(102,"sdf");
		m.put(103, "wfdf");
		m.put(104,"tat");
		m.put(103,"tat");
		m.put(105,"tat");
		//System.out.println(m);
		System.out.println(m);
		System.out.println(m.get(104));
		System.out.println(m.remove(104));
		System.out.println(m.containsKey(105));
		System.out.println(m.keySet());
		for(Object n:m.keySet())
		{
			System.out.println(n);
		}
		/*101
		102 read individual key and print
		103
		105*/
		
		System.out.println(m.values());
		for(Object v:m.values())
		{
			System.out.println(v);
		}
		
		for(Object i:m.keySet())
		{
			System.out.println(i+"   "+m.get(i));
		}
		
		for(Map.Entry entry:m.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}

		
	}

}
