package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.snapdeal.com");
	//driver.get("http://www.amazon.com");
	
	driver.navigate().to("http://www.amazon.com");
	
	driver.navigate().back();//snapdeal
	
	driver.navigate().forward();//forword amazon
	driver.navigate().refresh();
	
	driver.close();
	 
	

	}

}
