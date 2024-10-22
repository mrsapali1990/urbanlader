package synchronization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTextTest
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		//launch Url
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//open url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//enter data in  username and password
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 
		 //click on login button
		 driver.findElement(By.className("button")).click();
		 
		 //for verifying welcome text
		 String expTxt="Welcome Admin";
		 boolean actTxt=driver.getPageSource().contains(expTxt);
		 if(actTxt)
		 {
			 System.out.println("welcome msg is expected");
			 
		
		 }
		 else
		 {
		 System.out.println("well come msg in incorrect");
		 }
		 
		 driver.findElement(By.partialLinkText("Welcome")).click();
		 //explicit wait
		 @SuppressWarnings("deprecation")
		WebDriver wait= (WebDriver) new WebDriverWait(driver,30);
		 ((FluentWait<WebDriver>) wait).until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		 driver.findElement(By.linkText("Logout")).click();
		 
		 //checkpoint to verify logout button is present on the page
		 boolean found=driver.findElement(By.className("button")).isDisplayed();
				 if(found)
				 {
					 System.out.println("logged out currectly");
				 }
				 else
				 {
					 System.out.println("logged out not workign currectly");
				 }
		 
		 
		 //close driver
		 driver.close();
		 
		 
	}
	
	
	

}
