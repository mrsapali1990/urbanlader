package SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String []args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://facebook.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);  // wait three second
		driver.navigate().back();  //navigate to backward
		
		Thread.sleep(3000);
		driver.navigate().forward(); // navigate to forward
		
		Thread.sleep(5000);
		driver.navigate().refresh();   // refresh page
		
		driver.close();
	}

}
