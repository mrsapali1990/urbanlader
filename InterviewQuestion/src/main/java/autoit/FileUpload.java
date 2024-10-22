package autoit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://smallpdf.com/pdf-to-word");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@class=\"sc-8s01yt-5 gGeCVP\"]")).click();

	Thread.sleep(5000);

	Runtime.getRuntime().exec("E:\\AutoItUpload\\fileUpload1.exe");
}
}
