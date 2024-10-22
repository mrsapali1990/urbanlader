package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		System.out.println(driver.getTitle());
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement Login = driver.findElement(By.id("u_0_v"));
        username.sendKeys("m.wasnik@gmail.com");
        password.sendKeys("SHRIMILINDRAJ");
        Login.click();
       // Thread.sleep(2000);

		driver.close();
	//	driver.getTitle();
		
		
	}

}
