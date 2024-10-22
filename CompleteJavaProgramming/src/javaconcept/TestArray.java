package javaconcept;

public class TestArray {
	public static void main(String[] args) 
	{
		double[] myList= {1.9,2.9,3.0,3.10};
		//print all the array elements
		//difference between array and string array used .length and string used .lenght()
		for(int i=0;i<myList.length;i++)
		{
			System.out.println(myList[i]+" ");
		}

		//Adding All element
		double total=0;
		for(int i=0;i<myList.length;i++)
		{
			total=total+myList[i];
			//	total+=myList[i];
		}
		System.out.println("Total Addition is " +total);

		//Multiplication of all elements in array

		double totalMul=1;
		for(int i=0;i<myList.length;i++)
		{
			totalMul=totalMul*myList[i];
			//	total+=myList[i];
		}
		System.out.println("Total Mul is " +totalMul);
		//finding the largest element
		double max=myList[0];
		for(int i=0;i<myList.length;i++)
		{
			if(myList[i]>max)
				max=myList[i];

		}
		System.out.println("Max is "+max);
		
		double[] myList1= {1.9,2.9,3.0,3.10};
		for(double element:myList1) //for each loop
		{
			System.out.println(element);
		}

	}
}
