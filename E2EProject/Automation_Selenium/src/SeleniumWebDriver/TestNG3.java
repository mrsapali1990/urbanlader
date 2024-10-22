package SeleniumWebDriver;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG3 {
	@Test
	public void a()
	{
		System.out.println(" a method test");
	}
	@Test(enabled=false)
	public void b()
	{
		System.out.println(" b method test");
	}
	@Test
	public void c() {
		System.out.println(" c method test");
	}
	@Test
	public void d() {
		throw new SkipException(" d method skip");
	}

}
