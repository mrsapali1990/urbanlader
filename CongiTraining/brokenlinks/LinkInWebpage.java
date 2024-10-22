package brokenlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkInWebpage {


	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","E:\\software\\ChromeDriver100\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Webdriver is an interface and chrome driver is a class

		//Launching sample website
		//driver.get("https://artoftesting.com/sampleSiteForSelenium");
		driver.get("https://cogniwize.com/");
		driver.manage().window().maximize();

		//Get list of web-elements with tagName  - a
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("**********************************************");
		System.out.println(allLinks.size() +"No of link present size ");
		System.out.print("No of link present size " +allLinks.size());
		System.out.println("**********************************************");

		//Traversing through the list and printing its text along with link address
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
			
		}

		//Commenting driver.quit() for user to easily verify the links
		//driver.quit();
	} 

}


