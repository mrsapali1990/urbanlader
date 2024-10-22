package practiceTat;

public class LastFourUpper {

	public static void main(String[] args) {
		 String str="tathagat";
	        int str4=str.length();
	        System.out.println(str4);
	        String str1=str.substring(str.length() - 4);
	        String str2=str1.toUpperCase();
	        System.out.println(str2);
	        String str3=str.substring(0, str.length() - 4) + str2;
	        System.out.println(str3);

	}

}
