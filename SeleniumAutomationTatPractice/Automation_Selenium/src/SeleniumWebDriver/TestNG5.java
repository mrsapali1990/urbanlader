package SeleniumWebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG5 {

	@Test
	public void a() {
		Assert.assertTrue(3>10);
		System.out.println(" This is Sign Up Method");
	}
	@Test(dependsOnMethods = {"a"})
	public void b()
	{
		System.out.println("login functionaity");
	}
		
}

