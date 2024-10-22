package InterviewQuestion.InterviewQuestion;

public class Palindromestring {
	public static void main(String[] args) {
		
	
	
	String x="amar";
	String y="";
	String temp=x;
	for(int i=x.length()-1;i>0;i--)
	{
		y=y+x.charAt(i);
	}
	if(temp.equals(y))
	System.out.println("palindrome string"+temp);
	else
		System.out.println("not palindrome string");
	
	

}}
