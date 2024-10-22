package InterviewQuestion.InterviewQuestion;

public class LargestNumber {
	public static void main(String[] args) {
		int arr[]= {23,43,21,45,56};
		//caluclate length of array
		int len=arr.length;
		//used for loop for comparing
		for(int i=0;i<len;i++)
		{
			for (int j=i+1;j<len;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The second largest element is"+arr[len-2]);
	}
	

}
