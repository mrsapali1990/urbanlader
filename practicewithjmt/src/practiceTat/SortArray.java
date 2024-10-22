package practiceTat;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int arr[]= {1,4,3,5,9};
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.println(i);
		}
		String str="Tathagat, Wasnik";
		int lenght=str.length();
		System.out.println(lenght);//used lenght method
		
		int num = 42;
		String str22 = String.valueOf(num);
		System.out.println(str22);  // Output: "42"
		//trimming devide the string on the basis of delimiter
		String strrr="Hellow  World   I";
		String[] parts=strrr.split("//s+");
		for (String word : parts) {
		    System.out.println(word);
		}
		String ss="tatratgg sdffsd ffff";
	boolean s1=ss.startsWith("tat");
		System.out.print(s1);
	}

}
