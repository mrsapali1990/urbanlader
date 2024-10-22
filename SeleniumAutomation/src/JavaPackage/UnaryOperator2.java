package JavaPackage;

public class UnaryOperator2 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a++);//10
		System.out.println(a);//11
		System.out.println(a++ + ++a);//11+13=24
		System.out.println(a + a++);//13+13=26
		System.out.println(a);
		System.out.println(b++ + --b);//20 +20
		System.out.println(b++ + b--);//20(21)+21(20)=41
		System.out.println(b);
	}

}
