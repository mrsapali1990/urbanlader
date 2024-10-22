package InterviewQuestion.InterviewQuestion;

public class ReverseString {
	public static void main(String[] args) {
		
	
	String x="ttttat";
    String y="";
    String temp=x;
    for(int i=x.length()-1; i>=0; i--) {
        y=y+x.charAt(i);
    }
    System.out.println(y);
    if(temp.equals(y))
    
        System.out.println("palindrome number");
    else 
        System.out.println("not palindrome");
}}
