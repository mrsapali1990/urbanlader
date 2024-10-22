package completeStringProgram;

public class StringMethods {
	public static void main(String[] args) {
		int n;
		String s="Java@programming demo";
		
		System.out.println(s);
		n=s.length();
		System.out.println("length of string    "+n);
		
		
		//Split()
		String[] d1=s.split("@");
		
		for(String a :d1)
		System.out.println(a);//programming demo
		
		
		String[] d2=s.split(" ");
		
		for(String b :d2)
		System.out.println(b);//demo
//		
		String[] d3=s.split("@", -2);//rogramming demo
		for(String c :d3)
		System.out.println(c);//rogramming demo
	}

}
