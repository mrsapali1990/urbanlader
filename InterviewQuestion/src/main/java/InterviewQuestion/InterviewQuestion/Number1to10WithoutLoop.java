package InterviewQuestion.InterviewQuestion;

public class Number1to10WithoutLoop
//using recursion
{
	public static void main(String[] args) 
	{
		printNumbers(10);
		
	}
	public static void printNumbers(int i)
	{
		if(i>1)
		{
			printNumbers(i-1);
		}
		System.out.println(i);
	}

}
