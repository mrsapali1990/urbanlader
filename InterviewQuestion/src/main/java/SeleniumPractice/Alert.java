package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	public static void main(String[] args) throws Exception {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//Scroll down a window
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,200)");
		//*************************************Accept dismiss*************
		WebElement alert=driver.findElement(By.xpath("//button[text()=\"Alert\"]"));
		alert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//********************Accept and cancel***************************
		
		WebElement conframBox=driver.findElement(By.xpath("//button[text()=\"Confirm Box\"]"));
		conframBox.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		//******************************getText ************************
		
		WebElement promtAlert=driver.findElement(By.xpath("//button[text()=\"Prompt\"]"));
		promtAlert.click();
		Thread.sleep(10000);
		//sends keys not working
		driver.switchTo().alert().sendKeys("my name is khan");
		Thread.sleep(5000);
	//driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	
		
		//***********************send text*******************
//		promtAlert=driver.findElement(By.xpath("//button[text()=\"Prompt\"]"));
//		promtAlert.click();
//		Thread.sleep(3000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
		
	}}

