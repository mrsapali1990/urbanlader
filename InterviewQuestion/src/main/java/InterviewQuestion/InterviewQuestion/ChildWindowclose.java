package InterviewQuestion.InterviewQuestion;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowclose {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Scroll down a window
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		//click on child window element
		driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
		//get and store current window id
		String currenthandle=driver.getWindowHandle();

		//get all opend driver ID in the set

		Set<String> handles=driver.getWindowHandles();
		//get all opened driver ID in to the set
		System.out.println(handles);

		//for each loop

		for(String winid:handles)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}		

	}

}


