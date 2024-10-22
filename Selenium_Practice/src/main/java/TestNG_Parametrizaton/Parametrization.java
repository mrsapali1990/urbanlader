package TestNG_Parametrizaton;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	
	
	@Parameters("URL")
	@Test
	public void Login1(String uname) {

		System.out.println("This is login 1 method");
		System.out.println(uname);

	}
	
	@Test
	public void Login2() {

		System.out.println("This is login 2 method");

	}
	
	@Test
	public void Login3() {


		System.out.println("This is login 3 method");
	}
	
	@Test
	public void Login4() {
		System.out.println("This is login 4 method");
	}

	@Test
	public void Login5() {
		System.out.println("This is login 5 method");
	}
	
	@Test
	public void Login6() {
		System.out.println("This is login 6 method");
	}

}
