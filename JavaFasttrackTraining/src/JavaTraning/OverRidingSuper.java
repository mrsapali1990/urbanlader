package JavaTraning;


class Rect
{
void area(int x)
{   
	int y=12;
	System.out.println("The area of the rectangle is "+x*y+" sq units");
}
}

class overRidingChild extends Rect
{
	void area(int x)
	{
		double z = 3.14 * x * x;
		System.out.println("The area of the circle is "+z+" sq units");
	}

}
public class OverRidingSuper
{
	
	public static void main(String args[]) 
	{
		overRidingChild ob = new overRidingChild();
		//overRidingChild ob1 = new Rect();
		ob.area(11);
		ob.area(2);
	}
	
}