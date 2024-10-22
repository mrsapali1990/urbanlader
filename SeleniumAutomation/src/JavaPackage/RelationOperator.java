package JavaPackage;

public class RelationOperator {
	public static void main(String[] args) {
		int a=300;
		int b=300;
		if(a!=b)//(300!=300)
		{
			System.out.println("a is not equal to b");
		}else
		{
			System.out.println("a is equal to b");
		}
		String p="Selenium Class";//3e25a5
		String q="Selenium class";//3e25b5
		if(p==q)//==1st way string comparision
		{
			System.out.println("p and q are equal for first way");
		}else
		{
			System.out.println("p and q are not equal for first way");
		}
		
		//2nd way of string comparision
		if(p.equals(q))
		{
			System.out.println("p and q are equal for second way");
		}else
		{
			System.out.println("p and q not equal second way");
		}
		//3rd way for string for comparision right way for comparision(is currect way)
		if(p.equalsIgnoreCase(q))
		{
			System.out.println("p and q are equal for third way");
		}else
		{
			System.out.println("p and q are not equal for 3 rd way");
		}
		
	}
	

}
