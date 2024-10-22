package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingMousehover {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@id,\"u_0_0\")]")).click();
		Thread.sleep(2000);
		WebElement monthDrp=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		//monthDrp.click();
				WebElement jul=driver.findElement(By.xpath("(//select[@id=\"month\"]//following::option)[6]"));
				Thread.sleep(2000);
				Actions act=new Actions(driver);
				act.moveToElement(monthDrp).click().moveToElement(jul).click().build().perform();
	}

}
