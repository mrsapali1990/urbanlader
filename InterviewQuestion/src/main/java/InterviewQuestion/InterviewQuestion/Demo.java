package InterviewQuestion.InterviewQuestion;

public class Demo {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
				System.out.println();
			}
		}
	}

}
