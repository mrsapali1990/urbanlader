package SeleniumWebDriver;
import java.util.List;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton {
	public static void main (String [] args) throws Exception
	{
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
		
		//size() for size of findElements
		System.out.println(radios.size()); //3
		Thread.sleep(3000);
		
		//get() is for index list 
		// is enabled() its return boolean value  
		System.out.println(radios.get(1).isEnabled()); //true
		radios.get(1).click();
		//Thread.sleep(3000);
		System.out.println(radios.get(0).isDisplayed()); //true
		Thread.sleep(3000);
		radios.get(2).click();
		Thread.sleep(3000);
		System.out.println(radios.get(0).isSelected()); //false
		System.out.println(radios.get(1).isSelected()); //false
		System.out.println(radios.get(2).isSelected()); //true
		driver.close();
		
		
	}

}
