package InterviewQuestion.InterviewQuestion;

import edu.emory.mathcs.backport.java.util.Arrays;

public class ArrayAscending {
	public static void main(String[] args) {
		//write a java program for array ascending order
		int temp;
		int i,j;
		int a[]= {5,2,6,4};
		//The elements of the array are enclosed in square brackets and separated by commas.
		//As you can see, Arrays.toString(arr) converted the integer array arr into a string representation
		System.out.println("Before ascending order:"+Arrays.toString(a));
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println("After ascending order:"+Arrays.toString(a));
//		for(i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]);
//		}
	}
	

}
