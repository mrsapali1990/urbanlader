package com.sn.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sn.Commons.TestBase;

public class LoginPage extends TestBase {

	TestBase t = new TestBase();
	
	@FindBy(id = "sign_in_username")
	WebElement uname;
	
	@FindBy(id = "sign_in_username_btn")
	WebElement NextBtn;
	
	@FindBy(id = "sign_in_password")
	WebElement password;
	
	@FindBy(id = "sign_in_password_btn")
	WebElement Loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(t.driver, this);
	}
	
	public HomePage LoginData(String un, String pass)
	{
		uname.sendKeys(un);
		System.out.println(un);
		NextBtn.click();
		password.sendKeys(pass);
		System.out.println(pass);
		Loginbtn.click();
		return new HomePage();
	}
	
	
	
	public String verifyLogin()
	{
		return t.driver.getTitle();
	}

}
