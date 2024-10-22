package abstractDemo;

public class NewClass {
	public static void main(String[] args) {

		Car c1=new Car();
		c1.noOFWheels();

	}}
abstract class Vehicle
{
	abstract int noOFWheels();

	void color()
	{

	}

}
class Car extends Vehicle{
	int noOFWheels()
	{
		System.out.println("tathagat");
		return 4;
	}
}


