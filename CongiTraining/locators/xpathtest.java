package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//div[@id=\"divPassword\"]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"divLoginButton\"]/input")).click();
		
		
		
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Add")).click();
		
		
		driver.findElement(By.cssSelector("input.formInputText")).sendKeys("Tathagat");
		driver.findElement(By.cssSelector("input#middleName")).sendKeys("amit");
		driver.findElement(By.cssSelector("input[name=lastName]")).sendKeys("wasnik");
		driver.findElement(By.cssSelector("input[name^=chk]")).click();
		driver.findElement(By.cssSelector("[id$=_name]")).sendKeys("tat123");
		driver.findElement(By.cssSelector("input[type*=sswo]")).sendKeys("tat12344");
				
		
		
		// TODO Auto-generated method stub

	}

}
