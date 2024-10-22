package javaprogram;

public class DuplicateElement {
	public static void main(String[] args) {
		int arr[]= {12,23,34,22,12,23,45};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element is "+arr[j]+"at"+j+" index");
				}
			}
		}
	}

}
