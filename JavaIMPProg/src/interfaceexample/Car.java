package interfaceexample;

public class Car implements Streerable,Mode{
	public void turnLeft(int deg)
	{
		System.out.println("turn left"+deg+"degrees");
	}
	public void turnRight(int deg)
	{
		System.out.println("turn right"+deg+"degrees");
	}
	public void frontWheel()
	{
		System.out.println("front wheel drive");
	}public void backWheel()
	{
		System.out.println("back wheel drive");
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.backWheel();
		c.frontWheel();
		c.turnLeft(23);
		c.turnRight(40);
	}

}
