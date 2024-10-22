package JavaPackage;

public class UnaryOperator1 {
	public static void main(String[] args) {
		int i=2;
		System.out.println(i++);//First i=2  then increement execute the logic first then increement
		System.out.println(i);
		
		System.out.println(i++);//3
		System.out.println(i++);//4
		System.out.println(i);//5
		System.out.println(i);//5
	}

}
