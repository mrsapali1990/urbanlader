package HelperAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelperAnnotations {
	
	@Test
	public void Login1() {

		System.out.println("This is login 1 method");

	}
	
	@Test(dependsOnMethods= {"Login1"})
	public void Login2() {

		System.out.println("This is login 2 method");

	}
	
	@Test(enabled=false)
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
