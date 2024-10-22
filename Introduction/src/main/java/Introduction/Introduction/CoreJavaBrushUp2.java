package Introduction.Introduction;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class CoreJavaBrushUp2 {



	public static void main(String[] args) {

		int[] arr= {10,1,3,2,3,5,6,88,65,44};
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] % 2== 0)
			{
				System.out.println(arr[i]);
				break;
			}
			else
			{
				System.out.println(arr[i]+"Not multiple of two");
			}
		}
		ArrayList<String> a=new ArrayList<String>();
		a.add("Tathagat");
		a.add("Wasnik");
		a.add("messi");
		System.out.println(a.get(2));
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		//enhanced for loop
		System.out.println("*********************************");
		for(String val:a)
		{
			System.out.println(val);
		}
		//Item is present in array list or not
		
		System.out.println(a.contains("messi"));
		
		String[] arr1= {"AArohi","Anokhi","Anisha"};
		List<String> nameArrayList=Arrays.asList(arr1);
		nameArrayList.contains("Anokhi");
		
		
		
		

	}



}




