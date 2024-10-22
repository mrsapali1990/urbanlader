package SeleniumWebDriver;

import org.testng.annotations.Test;

public class TestNG2 {
	@Test(priority = -10)
	public void c() {
		System.out.println(" c method test");
	}

	@Test(priority = -20)
	public void b() {
		System.out.println(" b method test ");
	}

	@Test(priority = 0)
	public void d() {
		System.out.println(" d method test");
	}

	@Test(priority = 2)
	public void h() {
		System.out.println(" h method test");
	}

	@Test
	public void e() {
		System.out.println(" e method test");
	}

	@Test
	public void f() {
		System.out.println(" f method test");

	}

	@Test(priority = -30)
	public void a() {
		System.out.println(" a method test");
	}

	@Test(priority = 1)
	public void g() {
		System.out.println(" g method test");
	}

}
