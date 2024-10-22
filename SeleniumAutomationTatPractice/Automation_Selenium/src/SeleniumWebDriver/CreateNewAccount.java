package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {
	public static void main(String [] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Milind");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Wasnik");
		//driver.findElement(By.xpath("//input[@id='u_e_g_eR']")).sendKeys("8421585804");
		
		//Select For day
		Thread.sleep(3000);
		WebElement birthday=driver.findElement(By.xpath("//select[@id='day']"));
		Select day=new Select(birthday);
		day.selectByValue("24");
		
		
		//For Month select
		Thread.sleep(3000);
		WebElement birthmonth=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(birthmonth);
		month.selectByValue("6");
		//month.selectByIndex(5);
		//month.selectByVisibleText("Jun");
		
		//for the Year select 
		Thread.sleep(3000);
		 WebElement birthyear=driver.findElement(By.xpath("//select[@id='year']"));
		 Select year=new Select(birthyear);
		 year.selectByValue("1981");
		 Thread.sleep(3000);
		
		 //for  radio button 
		 List<WebElement> radios =driver.findElements(By.xpath("//input[contains(@type, 'rad')]"));
		 radios.get(1).click();
		 Thread.sleep(3000);
		 driver.close();
		
		
		
		
		
		
	}

}
