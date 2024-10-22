package Introduction.Introduction;

public class CoreJavaBrushUp1 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=5;
		arr[1]=5;
		arr[2]=7;
		arr[3]=4;
		arr[4]=6;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int[] name= {4,5,4,3,4};
		for (int i=0;i<name.length;i++)
		{
			System.out.println(name[i]); 
		}
		String[] surname= {"tathagat","wasnik","pandurang"};
		for(String s:surname)
		{
			System.out.println(s);
		}
		
	}

}
