package abstractDemo;

public class NewClass2 {
public static void main(String[] args) {
	Caar c1=new Caar();
	c1.vehiclecolor();
	c1.vehicleWheel();
	
}
}
abstract class Vehicleee
{
	 abstract  int vehicleWheel();
	 
	 public void vehiclecolor()
	 {
		 System.out.println("white");
	 }
}

class Caar extends Vehicleee
{
	 int vehicleWheel()
	{
		return 4;
	}
}
