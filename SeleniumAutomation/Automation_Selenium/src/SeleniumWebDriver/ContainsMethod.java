package SeleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsMethod {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		//find xPath by text();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
		//use findElements() for Multiple elements
		//use contains() for dynamic attribute vale
		List<WebElement> radios =driver.findElements(By.xpath("//input[contains(@type , 'rad' )]"));
		Thread.sleep(3000);
		System.out.println(" size of rados "+radios.size());
		
	}

}
