package Array;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
			min=arr[i];
			}
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
