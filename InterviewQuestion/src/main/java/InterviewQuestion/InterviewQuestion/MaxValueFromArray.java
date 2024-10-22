package InterviewQuestion.InterviewQuestion;

public class MaxValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,34,56,1,2,3,4,5,5,7};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("Maximum value in array   "+arr[arr.length-2]);

	}

}
