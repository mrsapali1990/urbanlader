package annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({"URL"})
	@Test
	public void webLoginCarLoan(String urlname) {
		System.out.println("weblogincar");
		System.out.println(urlname);
	}
	@BeforeMethod
	public void beforeTest()
	{
		System.out.println("I will execute before method/every test in Day3 class");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before executing all methods in the class");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After executing all methods in the class");
	}
	
	
	@AfterMethod
	public void afterTest()
	{
		System.out.println("I will execute After method/every test in Day3 class");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLoginCarLoan() {
		System.out.println("mobilelogincar");
	}
	@Test(enabled=false)
	public void mobileSignInCarLoan() {
		System.out.println("mobileSignincar");
	}
	@Test(timeOut=4000)
	public void mobileSignOutCarLoan() {
		System.out.println("mobileSignoutcar");
	}
	@AfterSuite
	public void bfSuite() {
		System.out.println("I m no 1 from last");
	}
	
	
//	@Test(dependsOnMethods= {"mobileSignInCarLoan","mobileSignOutCarLoan"})
	public void loginAPICarLoan() {
		System.out.println("APIlogincar");
	}

}
