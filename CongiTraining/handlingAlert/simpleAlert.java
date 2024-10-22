package handlingAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//open url
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		//
		//click on sign in button
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		//handle alert
		Alert alert =driver.switchTo().alert();
		String expMsg="Please enter a valid user name";
		String actMsg=alert.getText();		
		if(expMsg.equalsIgnoreCase(actMsg))
				{
			System.out.println("Msg as expected");
			
				}
		else
		{
			System.out.println("Msg incorrect");
		}
		//click on ok button
		alert.accept();
		Thread.sleep(5000);
		//
		driver.close();
		
	}

}
