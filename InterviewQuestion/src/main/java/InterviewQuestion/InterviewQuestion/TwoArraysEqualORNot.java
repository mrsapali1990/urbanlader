package InterviewQuestion.InterviewQuestion;

import edu.emory.mathcs.backport.java.util.Arrays;

public class TwoArraysEqualORNot {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {3,1,3,2};

		if(arr1.length!=arr2.length)
		{
			System.out.println("Both arrays are not equal");
		}
		else
		{
			boolean flag=true;
			for(int i=0;i<arr1.length;i++)
			{
				boolean flag1=false;


				for(int j=0;j<arr2.length;j++)
				{
					if(arr1[i]==arr2[j])
					{
						flag1=true;
						break;
					}

				}

				if(flag1==false)
				{
					flag=false;
				}
			}
			
			if(flag==true)
			{
				System.out.println("Both arrays are equal");
			}
			else
			{
				System.out.println("Both arrays not equal");
			}

		}



	}

}








//	Arrays.sort(arr1);
//	Arrays.sort(arr2);
//	boolean result=Arrays.equals(arr1, arr2);
//	System.out.println(result);

//	for(int i=0;i<arr1.length;i++)
//	{
//		for(int j=0;j<arr2.length;j++)
//		{
//			
//		}
//	}

