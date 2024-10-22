package JavaTraning;

public class CountCommandLineArgument 
{  
	public static void main(String args[]){  

		int count=0;
				for(int i=0;i<args.length;i++)  
				{
					count=count+1;
					System.out.println(args[i]);  

				}  
		System.out.println("Count is command Line Argument are    :" +count);
	}  
}