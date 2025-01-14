package com.sn.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sn.Commons.TestBase;

public class LoginPage extends TestBase {

	TestBase t = new TestBase();
	
	@FindBy(id = "username")
	WebElement uname;
	
	@FindBy(id = "usernameSubmitButton")
	WebElement NextBtn;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "submitButton")
	WebElement Loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(t.driver, this);
	}
	
	public HomePage LoginData(String un, String pass) throws InterruptedException
	{
		uname.sendKeys(un);
		System.out.println(un);
		NextBtn.click();
		Thread.sleep(3000);
		password.sendKeys(pass);
		System.out.println(pass);
		Loginbtn.click();
		Thread.sleep(10000);
		return new HomePage();
	}
	
	/*
	 * public String LoginVerify() { return LoginVerify }
	 */
	
	public String verifyLogin()
	{
		return t.driver.getTitle();
	}

}
