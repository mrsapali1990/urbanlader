package LearnJavaPrograms;

public class RemovalSpecialJunkCharFromString {
	public static void main(String[] args) {
		String str="***T@$%^&($#&(ATHAGAT***Wasnik";
		str=str.replaceAll("[^a-z,0-9,A-Z,*]","");
		System.out.println(str);
	}
}
