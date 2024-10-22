package JavaProgram;

public class totalCountOccurance {

	public static void main(String[] args)
	{

		String s="hello World";
		//total counts
		int totalCounts=s.length();
		System.out.println("Total no of Counts:"+totalCounts);

		//total count after remove
		int totalCount_afterRemove=s.replace("o","").length();
		System.out.println("Total count after Remove:"+totalCount_afterRemove);

		int count=totalCounts-totalCount_afterRemove;		
		System.out.println("No of occarance of o is:"+ count);

	}

}
