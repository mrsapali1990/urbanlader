package JavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\software\\Chromedrivernew\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		//click on create new account button
		//driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//find out create new account web elememnt using text();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);//cantroller stuck for 3 seconds
		
		//used contains methode for locating multiple web element
		List<WebElement>  radios=driver.findElements(By.xpath("//input[contains(@type,'radio')]"));
		System.out.println(radios.size());//3
		System.out.println(radios.get(1).isEnabled());//true
		radios.get(1).click();//click on male radio button
		Thread.sleep(3000);
		System.out.println(radios.get(0).isDisplayed());//true
		System.out.println(radios.get(1).isSelected());//true
		Thread.sleep(3000);
		radios.get(2).click();//click on custom radio button 
		Thread.sleep(3000);
		System.out.println(radios.get(1).isSelected());//false
		driver.close();
	}
}
