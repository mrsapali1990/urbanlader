package javaprogram;

class Bike extends Super
{
	int speed=100;
	void dispaly() {
		System.out.println(speed);
	}

	void display1() {
		System.out.println(super.speed);
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.dispaly();
		b.display1();
	}
}