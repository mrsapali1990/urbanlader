package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) 
	{
	/*System.setProperty("Webdriver.chorome.driver","E:\\software\\chromedriver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();*/
	
	//close broweser
	//driver.close();
	
	
	System.setProperty("webdriver.gecko.driver","E:\\software\\Firefoxdriver\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	//WebDriver driver1=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	//close broweser
	
	driver.close();
	
	
	
	
	

	}

}
