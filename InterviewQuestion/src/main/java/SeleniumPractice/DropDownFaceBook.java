package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownFaceBook {
	public static void main(String[] args) throws Exception {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//create an account by using xpath
	//driver.findElement(By.xpath("//a[contains(@id,\"u_0_0\")]")).click();
	
	//by using text()
	
	//driver.findElement(By.xpath("//*[text()=\"Create new account\"]")).click();
	//Thread.sleep(2000);
	
	//By using Following node:- 
	WebElement monthDrp=driver.findElement(By.xpath("//*[@id=\"month\"]"));
	Select month=new Select(monthDrp);
	String s4=month.getFirstSelectedOption().getText();
	System.out.println(s4);
	month.selectByVisibleText("Feb");
	Thread.sleep(5000);
	month.selectByValue("1");
	Thread.sleep(5000);
	month.selectByIndex(3);
	Thread.sleep(5000);
	
	
	
	
	
}



}
