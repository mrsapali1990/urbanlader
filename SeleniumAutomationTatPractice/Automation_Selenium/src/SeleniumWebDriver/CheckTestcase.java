package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTestcase {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String act_title = driver.getTitle();
		System.out.println("Actual Title:" + act_title);
		String exp_title = "OrangeHM";
		if (act_title.equals(exp_title)) {
			System.out.println("Test case Passesd");

		} else {
			System.out.println("Test case Failed");
		}

		driver.close();

	}

}
