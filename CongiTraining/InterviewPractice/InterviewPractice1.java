package InterviewPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewPractice1 {

	public static void main(String[] args)
	{

		System.setProperty("Webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

		
		//Single Web element
		//WebElement ele	=driver.findElement(By.xpath("//input[@title='Search']"));
		//ele.sendKeys("Tathagat");
		
		//multiple web element
		List<WebElement>links=driver.findElements(By.xpath("//div[@id='gws-output-pages-elements-homepage_additional_languages__als']//a"));
		System.out.println("Number of element capture:"+links.size());
		
		//driver.findElement(By.linkText("Gmail")).click();					
        //  System.out.println("title of page is: " + driver.getTitle());
        driver.findElement(By.partialLinkText("ail")).click();					
        System.out.println("Title of page is: " + driver.getTitle());

		driver.close();



	}

}
