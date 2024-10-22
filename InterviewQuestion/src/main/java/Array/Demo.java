package Array;

public class Demo {
	public static void main(String[] args) {
		String str="i am tathagat "
				+ "i am an automation engg ";
		
		int totalCount=str.length();
		int charCountT=str.replaceAll("t","").length();
		int charCountA=str.replaceAll("a", "").length();
		int countT=totalCount-charCountT;
		System.out.println("t count:"+countT);
		int countA=totalCount-charCountA;
		System.out.println("a count :"+countA);
		
	}

}
