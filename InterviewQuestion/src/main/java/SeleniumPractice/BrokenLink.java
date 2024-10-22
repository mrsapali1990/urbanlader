package SeleniumPractice;

import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.List;
//import java.util.concurrent.TimeUnit;
import java.net.URL;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BrokenLink {
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		// driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","E:\\software\\ChromeDriver100\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//WebDriver driver = new ChromeDriver(options);
		 driver=new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		long time = 2000;
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();

		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		//size of links
		System.out.println(allLinks.size());
		for(int i=0;i<allLinks.size();i++)
		{

			WebElement element=allLinks.get(i);
			String url=element.getAttribute("href");			
			URL link=new URL(url);
			HttpURLConnection httpConn=(HttpURLConnection)link.openConnection();
			httpConn.connect();
			int resCode=httpConn.getResponseCode();
			if(resCode>=400)
			{
				System.out.println(url+"-"+"Broken Link");
			}
			else
			{
				System.out.println(url+"-"+"is valid Link");
			}



		}}}
