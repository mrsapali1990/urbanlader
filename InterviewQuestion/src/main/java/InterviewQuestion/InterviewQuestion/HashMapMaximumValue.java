package InterviewQuestion.InterviewQuestion;

import java.util.HashMap;
import java.util.Map;

public class HashMapMaximumValue {
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("a",10);
		map.put("b",20);
		map.put("c",80);
		map.put("d",40);	
		map.put("e",50);
		//initializing  a variables to keep traking of the maximum value and its asociaated key
		int maxValue=Integer.MIN_VALUE;
		String maxKey=null;
		//itearet through the value to the hashmap;
		for( Map.Entry<String,Integer> entry:map.entrySet())
		{
			int currentValue=entry.getValue();
			//comare the current value with current maximum value
			if(currentValue>maxValue)
			{
				maxValue=currentValue;
				maxKey=entry.getKey();
			}
		}
		System.out.println("Maximum value        "+maxValue);
		System.out.println("key with maximum value     "+maxKey);
		
		
	}

}
