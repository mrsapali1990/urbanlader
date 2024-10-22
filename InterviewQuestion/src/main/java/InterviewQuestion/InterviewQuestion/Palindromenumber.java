package InterviewQuestion.InterviewQuestion;

public class Palindromenumber {

	public static void main(String[] args) {
		int num=12341;
		int r;
		int sum=0;
		
		int temp=num;
		while(num!=0)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
			
		}
		if(temp==sum)
		
		System.out.println("Palindrome number"   +sum);
		
		else 
			System.out.println("not palindrome number");
				

	}

}
