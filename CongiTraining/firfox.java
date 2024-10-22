
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class firfox 
{

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\software\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		

	}

}
