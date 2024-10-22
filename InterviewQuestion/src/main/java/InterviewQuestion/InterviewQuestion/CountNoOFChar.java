package InterviewQuestion.InterviewQuestion;

public class CountNoOFChar {
public static void main(String[] args) {
	int n=12345;
	int count=0;
	while(n!=0)
	{
		n=n/10;
		count++;
		
	}
	System.out.println(count);
	
//	String s="adasdsa";
//	int n=s.length();
//	System.out.println(n);
}
}
