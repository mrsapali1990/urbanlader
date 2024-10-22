package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePage {
	
	
	@Test
	@Parameters("browser")
	public void HomePage5() {

		System.out.println("This is hompage method");

	}
	
	
	
	@BeforeSuite
	public void HomePage1() {

		System.out.println("exicute BeforeSuite ");

	}
	
	@AfterSuite
	public void HomePage2() {

		System.out.println("exicute AfterSuite ");

	}
	
	@BeforeClass
	public void  HomePage3() {
		System.out.println("HomePage exicute BeforeClass");
	}
	
	@AfterClass
	public void  HomePage4() {
		System.out.println(" HomePage exicute AfterClass");
	}
	
	
	
}
