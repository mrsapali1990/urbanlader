package practiceTat;

public class TwoArrayCommonEle {

	public static void main(String[] args) {

		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,5};

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++) {

				if(arr1[i]==arr2[i])
				{
					System.out.print(arr1[i]);
				}

			}

		}

	}

}
