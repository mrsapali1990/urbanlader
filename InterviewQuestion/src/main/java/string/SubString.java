package string;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str="hello,world";
//		String parts[]=str.split(",");
//		System.out.println(parts.length);
//		for(int i=0;i<parts.length;i++)
//		{
//			String word=parts[i];
//			System.out.println(word);
//		}
//		
		String str="Tathagat,Pandurang,Wasnik";
		String words[]=str.split("//s");//return type is String array
		for(String s:words)
		{
			System.out.println(s);
		}

	}

}
