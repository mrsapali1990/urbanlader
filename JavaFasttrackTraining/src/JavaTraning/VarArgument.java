package JavaTraning;

public class VarArgument  {

	public int sumNumber(int ... args)
	{
		System.out.println("argument length: " + args.length);
		int sum = 0;
		for(int x: args)
		{
			sum=sum+x;       //sum += x;
		}
		return sum;
	}
	public int mulNumber(int ... args)
	{
		System.out.println("argument length: " + args.length);
		int mul= 1;
		for(int x: args) 
		{
			mul=mul*x;   // mul *= x;
		}
		return mul;
	}

	public int subNumber(int ... args)
	{
		System.out.println("argument length: " + args.length);
		int sub= 0;
		for(int x: args) 
		{
			sub=sub-x ;         //sub -= x;
		}
		return sub;
	}
	public int divNumber(int ... args)
	{
		System.out.println("argument length: " + args.length);
		int div= 1200;
		for(int x: args) 
		{
			div=div/x;
		}
		return div;
	}


	public static void main( String[] args ) {
		VarArgument ex = new VarArgument();

		int sum2 = ex.sumNumber(2, 4);
		System.out.println("sum2 = " + sum2);

		int sum3 = ex.sumNumber(1, 3, 5);
		System.out.println("sum3 = " + sum3);

		int sum4 = ex.sumNumber(1, 3, 5, 7);
		System.out.println("sum4 = " + sum4);

		int mul2 = ex.mulNumber(2, 4);
		System.out.println("mul2 = " + mul2);

		int mul3 = ex.mulNumber(2, 4, 6);
		System.out.println("mul3 = " + mul3);

		int mul4 = ex.mulNumber(2, 4, 6, 8);
		System.out.println("mul4 = " +mul4);

		int sub2 = ex.subNumber(4, 4);
		System.out.println("sub2 = " + sub2);

		int sub3 = ex.subNumber(2, 4, 6);
		System.out.println("sub3 = " + sub3);

		int sub4 = ex.subNumber(2, 4, 6, 8);
		System.out.println("sub4 = " +sub4);

		int div2 = ex.divNumber(12, 10);
		System.out.println("div2 = " + div2);


	}
}


