package InterviewQuestion.InterviewQuestion;

public class PrimeNumber1 {
	public static void main(String[] args) {
		int num=10;
		boolean prime=true;
		for(int i=2;i<num;i++)

		{
			if(num%i==0)
			{
				prime=false;
				break;
			}

		}
		System.out.println(prime);
	}
	
	
	

}
