package javaprogram;

public class MaxUnsortedArray {
	public static void main(String[] args) {
		int[] arr= {1,45,67,98,455,678};
		int max=0;
		for(int element : arr)
		{
			if(element>max) {
				max=element;
			}
		}
	System.out.println("Max element is  "  +max);
	}
	

}
