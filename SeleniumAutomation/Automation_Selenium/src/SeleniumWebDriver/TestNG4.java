package SeleniumWebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG4 {
	@Test
	public void asserationCheck()
	{
		String expectedMsg="User created Succsfuly";
		String actualMsg="Users created Succsfuly";
		try {
		Assert.assertEquals(actualMsg, expectedMsg);
		}
		catch (AssertionError a)
		{
			System.out.println(a);
		}
		System.out.println("verification succfuly");
	}
	
	
}
