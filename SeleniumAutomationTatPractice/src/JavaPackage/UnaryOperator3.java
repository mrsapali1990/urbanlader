 package JavaPackage;

public class UnaryOperator3 {
public static void main(String[] args) {
	int a=10;
	int b=10;
	System.out.println(a++);//10(11)
	System.out.println(a++   +  ++a);//11(12)+13(13)=11+13=24
	System.out.println(b++  +   ++b);//10(11)+12(12)=10+12=22
	System.out.println(b);//12
}
}
