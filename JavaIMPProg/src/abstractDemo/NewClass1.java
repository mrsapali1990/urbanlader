package abstractDemo;

public class NewClass1 {
	public static void main(String[] args) {
		Carr c1=new Carr();
		c1.noOFVehicle();
	}

}

abstract class Vehiclee
{
	abstract  int noOFVehicle();

}

class Carr extends Vehiclee
{
	int noOFVehicle() 
	{
		// TODO Auto-generated method stub
		return 4;
	}
}