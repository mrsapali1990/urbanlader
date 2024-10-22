package completeStringProgram;

public class CompareString {
	public static void main(String[] args) {
//		String s1="hello";
//		String s2="hello";
//		String s3="mdmff";
//		String s4="hemlo";
//		String name="tathagat";
//		String first ="tathagat";
		String obj1=new String("tathagat");
		String obj2=new String("tathagat");
		
//		System.out.println(s1.compareTo(s2));//true
//		System.out.println(s1.compareTo(s3));//false
//		System.out.println(s1.compareTo(s4));//false
//		System.out.println(s1.equals(s2));//compare reference value of string
//		System.out.println(s1==s2);//true compare on string reference
//		System.out.println(s1==s3);//false
		
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));//true
		
		String s1="  hello string  ";//used trim methode
		System.out.println(s1+"tathagat");//without trim()
		System.out.println(s1.trim()+"tathagat");//with trim()
		
		String l1="HELOO STRING";
		String l1lower=l1.toLowerCase();
		System.out.println(l1lower);
		
		
		String u1="HfdgO STsfgfG";
		String u1upper=u1.toUpperCase();
		System.out.println(u1upper);
		
		
		
		
		
	}

}
