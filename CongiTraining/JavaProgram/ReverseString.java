package JavaProgram;

public class ReverseString {

	public static void main(String[] args) {
		
		String x="Bharat";
		String y="";
		for(int i=x.length()-1;i>=0;i--)//i=6-1=5,i=4
		{
			
			y=y+x.charAt(i);//y=t,
			
		}
		System.out.println(y);
	}

}
