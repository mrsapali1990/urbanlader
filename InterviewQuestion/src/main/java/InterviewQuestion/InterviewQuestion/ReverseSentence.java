package InterviewQuestion.InterviewQuestion;

public class ReverseSentence {
public static void main(String[] args) {
	String x="my name is Tathapa";
	String y="";
	String a[]=x.split("\\s");
	for(int i=a.length-1;i>=0;i--)
	{
		y=y+a[i]+" ";
	}
	System.out.println(y);
}
}
