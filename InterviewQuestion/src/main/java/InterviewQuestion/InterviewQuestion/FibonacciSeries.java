package InterviewQuestion.InterviewQuestion;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.print("fibonacci series");
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<5;i++)
		{
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
				
		}
		 
	        
		
		
	}

}
