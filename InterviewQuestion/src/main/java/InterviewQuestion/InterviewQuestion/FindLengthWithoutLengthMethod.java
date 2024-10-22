package InterviewQuestion.InterviewQuestion;

public class FindLengthWithoutLengthMethod {
	public static void main(String[] args) {
		String str="find length";
		char ch[]=str.toCharArray();
		int count=0;
		for(int len:ch)
		{
			count++;
		}
		System.out.println("length of charecter of sentence    "+count);
	}

}
