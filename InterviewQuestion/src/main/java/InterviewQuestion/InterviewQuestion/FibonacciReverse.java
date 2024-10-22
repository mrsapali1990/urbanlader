package InterviewQuestion.InterviewQuestion;

public class FibonacciReverse {
	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=0;
		arr[1]=1;
		System.out.println("*********Fibonaci series********************");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		for(int i=2;i<arr.length;i++)
		{
			arr[i]=arr[i-2]+arr[i-1];
			System.out.println(arr[i]+" ");
			
		}
		System.out.println("*********Reverse Fibonaci series********************");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
		
	}

}
