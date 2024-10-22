package JavaPackage;

class Honda4 extends Bike{
	void run()
	{
		System.out.println("running safely....");
	}
	public static void main(String[] args) {
		Bike ref=new Honda4();
		ref.run();
	}

}
