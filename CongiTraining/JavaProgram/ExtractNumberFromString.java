package JavaProgram;
public class ExtractNumberFromString {

	

	public static void main(String[] args) {
		String x = "my accont n1234umbr";
		String y="";
		
		for(int i=0;i<x.length();i++) {
			if(Character.isDigit(x.charAt(i))) {
				y=y+x.charAt(i);
				
			}
		}
		
		System.out.println(y);
	}

}