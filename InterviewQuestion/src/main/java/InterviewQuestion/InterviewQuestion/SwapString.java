package InterviewQuestion.InterviewQuestion;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java prog";
		String str2="Selenium testNG";
		str1=str1+" "+str2;
		System.out.println(str1);
		
		String countWord[]=str1.split("\\s");
		System.out.println(countWord.length);//4
		str2=str1.split(" ")[0];
		String str3=str1.split(" ")[1];
//		
		String str0=str1.split(" ")[2];
		str1=str1.split(" ")[3];
//		
		System.out.println("str1 :-"+str0+" "+str1);
		System.out.println("str2 :-"+str2+" "+str3);

	}

}
