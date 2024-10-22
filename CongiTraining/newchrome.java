import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newchrome
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		// TODO Auto-generated method stub

	}

}
