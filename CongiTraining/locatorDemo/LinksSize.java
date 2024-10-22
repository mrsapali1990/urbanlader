package locatorDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksSize {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//ChromeDriver driver1=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//using class webelement or locator
		int slider=driver.findElements(By.className("homeslider-container")).size();
	System.out.println(slider);
	
	//using tag locator
	int TotalLink=driver.findElements(By.tagName("a")).size();
	System.out.println(TotalLink);
	
	//Get list of web-elements with tagName  - a
	 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	 
	 //Traversing through the list and printing its text along with link address
	 for(WebElement link:allLinks){
	 System.out.println(link.getText() + " - " + link.getAttribute("href"));
	 } 
	
	

}
}