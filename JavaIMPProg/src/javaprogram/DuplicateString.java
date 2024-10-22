package javaprogram;

public class DuplicateString  {
	public static void main(String[] args) {
	//	int arr[]= {12,23,34,22,12,23,45};
	String arr[]={"Tatha","Wasnik","Tatha","Pandurang"};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1+1;j<arr.length;j++)
			{
				if((arr[i].equals(arr[j]))&&(i!=j))
				{
					System.out.println("Duplicate element is "+arr[j]+" at "+j+" index");
				}			}		}	}}


