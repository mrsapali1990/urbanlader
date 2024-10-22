package seleniumpoc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\SoftwareJMT\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// Load the website
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement win=driver.findElement(By.xpath("//button[@id='openwindow']"));
		win.click();
		

		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		System.out.println(parent);

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);

		}
		
}
