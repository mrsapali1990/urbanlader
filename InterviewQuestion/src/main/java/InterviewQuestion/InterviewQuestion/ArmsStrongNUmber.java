package InterviewQuestion.InterviewQuestion;

public class ArmsStrongNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int temp=n;
		int sum=0;
		int r;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armsstrong number");
		}

	}

}
