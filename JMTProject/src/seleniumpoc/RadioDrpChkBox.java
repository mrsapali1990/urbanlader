package seleniumpoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioDrpChkBox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\SoftwareJMT\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//script for redio button
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		//script fot checkbox
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		//drop down
		
		WebElement drp=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s=new Select(drp);
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		s.selectByVisibleText("Option1");
		Thread.sleep(2000);
		s.selectByValue("option2");
		Thread.sleep(2000);
		s.selectByIndex(3);

	}

}
