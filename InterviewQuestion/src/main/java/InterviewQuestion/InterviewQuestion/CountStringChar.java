package InterviewQuestion.InterviewQuestion;

public class CountStringChar {

	public static void main(String[] args) {
		String str="ttsd";  
		System.out.println(str.length());
		int length=0;
		char a[]=str.toCharArray();
		//System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			length++;
		}
		System.out.println(length);
		
		

	}

}
