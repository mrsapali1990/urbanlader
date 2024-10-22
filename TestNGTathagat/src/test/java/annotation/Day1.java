package annotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Day1 {
	@Test(groups= {"Smoke"})
	public void demo() {
		System.out.println("hello");
	}


	@AfterTest
	public void lastExecute() {
		System.out.println("********I will execute last");
	}
	@BeforeSuite
	public void bfSuite() {
		System.out.println("I m no 1");
	}

	@Test
	public void  methode1()
	{
		System.out.println("buy");
	}


}
