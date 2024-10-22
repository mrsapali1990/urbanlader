package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void Login1() {

		System.out.println("This is login 1 method");

	}
	
	@Test
	public void Login2() {

		System.out.println("This is login 2 method");

	}
	
	@BeforeTest
	public void Login3() {


		System.out.println("exicute before test");
	}
	
	@AfterTest
	public void Login4() {
		System.out.println("exicute afeter test");
	}

	@BeforeClass
	public void Login5() {
		System.out.println("exicute BeforeClass");
	}
	
	@AfterClass
	public void Login6() {
		System.out.println("exicute AfterClass");
	}

}
