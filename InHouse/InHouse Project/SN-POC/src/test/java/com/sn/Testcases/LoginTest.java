package com.sn.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sn.Commons.TestBase;
import com.sn.Pages.HomePage;
import com.sn.Pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;

	// Constructor of class
	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws Exception {
		launch();
		loginpage = new LoginPage();
		homepage = new HomePage();

	}

	@Test
	public void verifyLoginPage() {
		String page = loginpage.verifyLogin();
		Assert.assertEquals(page, "ServiceNow", "Login page does not matches");
	}

	@Test
	public void loginTest() throws InterruptedException {
		homepage = loginpage.LoginData(p.getProperty("un"), p.getProperty("pass"));
		
	}

	
	  @AfterMethod 
	  public void teardown()
	  { 
		  driver.quit();
	  }
	 

}
