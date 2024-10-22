package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sample {
	
		public static void main(String[] args) {
//	        System.out.println("Try programiz.pro");
//	        ArrayList<Integer> arrList=new ArrayList<Integer>();
//	        arrList.add(100);
//	        arrList.add(200);
//	        arrList.add(300);
//	        arrList.add(400);
//	        arrList.add(100);
//	        
//	        for(Integer obj:arrList)
//	        {
//	        System.out.println(obj);
//	        }
//	        String  arr[]={"Dog","Cat","elephant"};
//	        
//	        for(String ele1:arr)
//	        {
//	            // list1.add(ele1);
//	             System.out.println(ele1);
//	        }
//	         ArrayList list1=new ArrayList(Arrays.asList(arr));
//	        System.out.println(list1);
			HashMap<Integer,String> hm=new HashMap<Integer,String>();
			hm.put(1, "Tathagat");
			hm.put(2, "Mallikarjun");
			hm.put(3, "Saisikamal");
			hm.put(4, "Jalindar");
			hm.put(5, "Nitinsir");
			System.out.println(hm);
			for(Map.Entry m:hm.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
 
	}
//    class Demo
//	{
//	int marks[]=new int[5];	
//	}
		

}
