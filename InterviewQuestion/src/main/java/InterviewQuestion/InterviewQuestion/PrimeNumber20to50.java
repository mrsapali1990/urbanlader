package InterviewQuestion.InterviewQuestion;

public class PrimeNumber20to50 {
	public static void main(String[] args)
	{
		
	int i,number=20;
	int count=0;
	while(number<=50)
	{
	    count=0;
	    i=2;
	    while(i<=number/2)
	    {
	        if(number%i==0)
	    {
	        count++;
	        break;
	    }
	    i++;
	}
	if(count==0 && number!=1)
	{
	    System.out.println(number+" ");
	}
	number++;
	}
	}
	}
