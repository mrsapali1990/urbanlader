package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameMMethods {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	//by using index 
	//driver.switchTo().frame(0);
	
	//driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-0\"]")).sendKeys("tathagat");
	//by using framename or id
	//driver.switchTo().frame("frame-one796456169");
	//driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-0\"]")).sendKeys("tathagat");
	
	//by using webelement
	
	//here provide id value
	WebElement element=driver.findElement(By.id("frame-one796456169"));
	driver.switchTo().frame(element);
	driver.findElement(By.xpath("//input[@id=\"RESULT_TextField-0\"]")).sendKeys("tathagat");
		
}}
