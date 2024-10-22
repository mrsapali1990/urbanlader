package JavaPackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

//import net.sourceforge.tess4j.ITesseract;
//import net.sourceforge.tess4j.Tesseract;

public class Alert2 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\software\\Chromedrivernew\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();//It will maximize the window
		driver.manage().deleteAllCookies();
//		Thread.sleep(3000);//For Entering the Captcha before 5sec
		
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Click here to Login in application']")).click();
//		driver.findElement(By.xpath("(//*[@id='nlpImgContainer']//following::img)[2]")).click();
		WebElement imageelement = driver.findElement(By.xpath("(//*[@id='nlpImgContainer']//following::img)[2]"));
		File src= imageelement.getScreenshotAs(OutputType.FILE);
		String path="H:\\IRCTC Project\\IRCTC\\IRCTC-CaptchaHandeling\\captchaimages\\captcha.png";
		FileHandler.copy(src,new File(path));
		Thread.sleep(5000);
//		ITesseract image = new Tesseract();
//		System.out.println("The value of the attribute 'Name' is " + attr);
		
}
}
