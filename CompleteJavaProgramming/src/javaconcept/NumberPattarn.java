package javaconcept;

public class NumberPattarn {
	public static void main(String[] args) {
		int num=1,rows=4;
		for(int i=rows;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
				
			}
			System.out.println();
		}
	}

}
