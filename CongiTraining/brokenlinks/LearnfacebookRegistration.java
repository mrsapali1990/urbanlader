package brokenlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnfacebookRegistration { 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\software\\ChromeDriver100\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUzMjAzNzgzLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");;
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Tathagat");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		
		Select drp=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		drp.selectByValue("4");//select by index
		
		Select drp1=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		drp1.selectByVisibleText("Jun");//select by visibility text
		
		Select drp2=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		drp2.selectByIndex(0);//select by value
		

	}

}
