package InterviewQuestion.InterviewQuestion;

public class ReverseFibonacciSeries {
public static void main(String[] args) {
	System.out.println("Reverse Fibonacci Series:");
	int arr[]= new int[5];
	arr[0]=0;
	arr[1]=1;
	for(int i=2;i<arr.length;i++)
	{
		arr[i]=arr[i-2]+arr[i-1];
		
		
	}
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]+" ");
	}
	
			
	}
}


