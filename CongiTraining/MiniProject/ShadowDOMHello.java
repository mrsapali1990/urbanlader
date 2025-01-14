package MiniProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMHello {
	 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
 
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("chrome://downloads/");
		
		WebElement root = driver.findElement(By.cssSelector("downloads-manager"));
		
		WebElement shadowRoot1 = (WebElement) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root);
 
		WebElement root2 = shadowRoot1.findElement(By.cssSelector("downloads-toolbar"));
		WebElement shadowRoot2 = (WebElement) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root2);
 
		WebElement root3 = shadowRoot2.findElement(By.cssSelector("cr-toolbar"));
		WebElement shadowRoot3 = (WebElement) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root3);
 
		
		WebElement root4 = shadowRoot3.findElement(By.cssSelector("cr-toolbar-search-field"));
		WebElement shadowRoot4 = (WebElement) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root4);
 
		shadowRoot3.findElement(By.cssSelector("#searchInput")).sendKeys("Hello");
		//String Search="document.querySelector("body > downloads-manager").shadowRoot.querySelector("#toolbar").shadowRoot.querySelector("#toolbar").shadowRoot.querySelector("#search").shadowRoot.querySelector("#icon").shadowRoot.querySelector("#icon > iron-icon")";
				
	}
 
}