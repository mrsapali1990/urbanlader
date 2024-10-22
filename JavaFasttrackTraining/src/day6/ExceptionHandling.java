package day6;
public class ExceptionHandling{
	public static int divideNumber(int a,int b)throws ArithmeticException{
		int div=a/b;
		return div;
	}
	
	
		public static void main(String[] args) {
			ExceptionHandling obj1=new ExceptionHandling();
			try
			{
				System.out.println(obj1.divideNumber(45, 0));
			
}
			catch(ArithmeticException e) {
				
				System.out.println("Number can not devide by zero");
			}

           int arr[]= {23,45,54,33};
           try {
           for(int i=0;i<=arr.length;i++)
        	   System.out.println(arr[i]);}

           catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println("Array out of bound exception");
			}

	}

}
