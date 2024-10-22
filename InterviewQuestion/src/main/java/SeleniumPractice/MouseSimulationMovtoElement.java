package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseSimulationMovtoElement {
	
	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement desktop=driver.findElement(By.xpath("(//a[@class=\"nav-link dropdown-toggle\"])[1]"));
		WebElement mac=driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[2]"));
		//Mouse simulation Mouse hover operation
		Actions act=new Actions(driver);
		act.moveToElement(desktop).moveToElement(mac).click().perform();

}}
