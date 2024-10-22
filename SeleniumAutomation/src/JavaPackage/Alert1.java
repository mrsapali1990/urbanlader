package JavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\software\\Chromedrivernew\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();//It will maximize the window
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		//handle alert
		System.out.println(driver.switchTo().alert().getText());
		String stringExpectedAlert="Please enter a valid user name";
		if(driver.switchTo().alert().getText().equalsIgnoreCase(stringExpectedAlert)) {
			System.out.println("Alert get verified");
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		
		}
		
	}

}

