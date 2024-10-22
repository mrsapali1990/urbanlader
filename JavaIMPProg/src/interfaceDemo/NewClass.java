 package interfaceDemo;

public class NewClass {
public static void main(String[] args) {
	fifthClass f1=new fifthClass();
	f1.percentage();
	
}
}

interface Result
{
	int max_Result=100;
	float percentage();
	
}

class fifthClass implements Result
{
	public float percentage() {
		int a=max_Result*2;
		System.out.println("tat");
		return 1;
		
	}
	
}
