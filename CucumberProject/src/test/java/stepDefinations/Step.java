package stepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.AdminPage;

public class Step extends Base {
	@Given("User Launch chrome Browser")
	public void user_Launch_chrome_Browser() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\software\\Chromedrivernew\\chromedriver.exe");
	    driver=new ChromeDriver();
	    Thread.sleep(2000);
	    ap=new AdminPage(driver);
	}

	@When("User open URL {string}")
	public void user_open_URL(String url) {
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
		ap.setUserName(email);
		ap.setPassword(password); 
	  
	}

	@When("User click on Login")
	public void user_click_on_Login() {
		ap.clickLogin();
	   
	}
}
