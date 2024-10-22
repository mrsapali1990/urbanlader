package stringmethodes;

public class ReplaceSpecialCharPrintString {

	public static void main(String[] args) {
		String str="This#String%Contains@Special*Char&";
		
		System.out.println("this is given string                    :-"+str);
		str=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(str);

	}

}
