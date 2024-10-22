package throwandthrows;

public class ThrowEg {



	public  void elegibility(int age)
	{
		if (age<18)
		{
			throw new ArithmeticException("not valid");

		}
		else
		{
			System.out.println("eligble for voting");
		}

	}






	public static void main(String[] args)  {
		ThrowEg tg=new ThrowEg();
		tg.elegibility(19);
	}

}
