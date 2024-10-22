package JavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\software\\ChromeDriver100\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		//click on create new account button
		//driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//find out create new account web elememnt using text();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);//cantroller stuck for 3 seconds
		
		//click on feamle radio button
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(3000);//cantroller stuck for 3 seconds
		//click on male radio button		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);//cantroller stuck for 3 seconds
		//click on custom button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		driver.close();		
		
	}

}
