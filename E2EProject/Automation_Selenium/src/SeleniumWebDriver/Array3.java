package SeleniumWebDriver;

public class Array3 {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6}};
		int row=arr.length;
		System.out.println("Length of Row:"+row);
		int col=arr[0].length;
		System.out.println("Length of Coloum:"+col);
		
		//Display Array
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
