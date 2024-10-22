package SeleniumWebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@Test
	public void T() {
		System.out.println(" T Test Case Executed");
	}

	@BeforeMethod
	public void a() {
		System.out.println(" Before method Executed");
	}

	@BeforeSuite
	public void b() {
		System.out.println(" Before Suite Executed");
	}

	@BeforeClass
	public void c() {
		System.out.println(" Before Class Exeuted");
	}

	@BeforeTest
	public void d() {
		System.out.println("Before Test Executed");
	}

	@AfterClass
	public void e() {
		System.out.println("After Class Executed");
	}

	@AfterSuite
	public void f() {
		System.out.println("After Suite Executed");
	}

	@AfterTest
	public void g() {
		System.out.println("After Test Executed");

	}

	@AfterMethod
	public void h() {
		System.out.println("After method Executed");
	}

	@Test
	public void M() {
		System.out.println("M Test Executed");
	}

	public static void main(String[] args) {
		System.out.println("This is main Method");
	}
	
}
