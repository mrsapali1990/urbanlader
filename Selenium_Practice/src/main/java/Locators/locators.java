package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver107\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486387378181&hvpos=&hvnetw=g&hvrand=3188031441316600198&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062111&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=Cj0KCQiA5NSdBhDfARIsALzs2EBkVhWTCX8ioOgREeKRNqo6Eyuv59jGc5vNsA6Jm_R-O9Sy2hGN4bcaAqjaEALw_wcB");
		
		//ID
		//driver.findElement(By.id(""));
		
		//name
		//driver.findElement(By.name(""));
		
		//classname
		driver.findElement(By.className("nav_a")).click();
		
		//tagename
		//driver.findElement(By.tagName(""));
		
		//linktext
		//driver.findElement(By.linkText(""));
		
		//partiallinktext
		//driver.findElement(By.partialLinkText(""));
		
		
		
	}

}
