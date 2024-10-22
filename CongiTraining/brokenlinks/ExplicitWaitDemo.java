package brokenlinks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) 
	{// Start browser
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Start application
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

		// Click on timer button to start
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		// Create object of WebDriverWait class and it will wait max of 20 seconds.
		// By default it will accepts in Seconds
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Here we will wait until element is not visible, if element is visible then it will return web element
		// or else it will throw exception
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

		// if element found then we will use- In this example I just called isDisplayed method
		boolean status = element.isDisplayed();

		// if else condition
		if (status) {
			System.out.println("===== WebDriver is visible======");
		} else {
			System.out.println("===== WebDriver is not visible======");
		}
//		//Declare and initialise a fluent wait
//		FluentWait wait = new FluentWait(driver);
//		//Specify the timout of the wait
//		wait.withTimeout(5000, TimeUnit.MILLISECONDS);
//		//Sepcify polling time
//		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
//		//Specify what exceptions to ignore
//		wait.ignoring(NoSuchElementException.class)
//
//		//This is how we specify the condition to wait on.
//		//This is what we will explore more in this chapter
//		wait.until(ExpectedConditions.alertIsPresent());
	}

}