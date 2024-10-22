package JavaPackage;

public class HondaCar {
	public static void main(String[] args) {
		Car obj1=new Car();
		System.out.println(obj1.number);
		System.out.println(obj1.name);//Variable call directlly in Syso by using Object
		obj1.brake();
		obj1.steering();
	}

}
