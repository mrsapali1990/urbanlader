package InterviewQuestion.InterviewQuestion;

public class Starpatteren1 {
	public static void main(String[] args) {
		int num=10;
		for(int i=1;i<=4;i++)
		{
			for (int j=4;j>=i;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
				{System.out.print(num);
			num--;}
			System.out.println();
		}
	}}
