package pageObjectsModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	public WebDriver idriver;
	public LoginPage(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txtUser;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath="//h6[normalize-space()='PIM']")
	WebElement moveHome;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement invalidPwd;
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")
	WebElement adminClick;
	
	public void setUserName(String uname) throws Exception {
//		txtUser.clear();
		Thread.sleep(3000);
		txtUser.sendKeys(uname);
	}
	public void setPassword(String pwd) throws Exception {
//		txtPassword.clear();
		Thread.sleep(3000);
		txtPassword.sendKeys(pwd);
	}
	public void clickLogin() {
		
		btnLogin.click();
	}
	
	public void getTitle() {
		String ActualName=moveHome.getText();
		System.out.println(ActualName);
		String expName = "PIM";
		Assert.assertEquals(ActualName, expName, "HomePage Open successfully!!");
		System.out.println("First Assertion pass........");

	}
	
	public void getMsg() {
		String errMsg=invalidPwd.getText();
		System.out.println("Error msg shows on screen       :"+errMsg);
	}
	
	public void clickAdmin() {
		adminClick.click();
	}
	
}
