package collection;

import java.util.HashMap;
import java.util.Map;

public class Type3HashMap {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(100,"tathagat");
	hm.put(200,"mallikarjun");
	for(Map.Entry m:hm.entrySet()) {
		System.out.println(m.getKey()+""+m.getValue());
	}
		}
}
