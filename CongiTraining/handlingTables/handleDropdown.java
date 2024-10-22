package handlingTables;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleDropdown
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		//laucnh
		System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	      
	      
	      //read properties file
	      Properties p=new Properties();
	      FileInputStream f=new FileInputStream("C:\\Users\\Tathagat\\eclipse-workspace\\OrangeHRM\\Login.properties");
	      p.load(f);
	      
	 
	      
	      //open url
	      driver.get(p.getProperty("url"));
	      driver.manage().window().maximize();
	      
	      //login
	      driver.findElement(By.name(p.getProperty("user"))).sendKeys("Admin");
	      driver.findElement(By.id(p.getProperty("pass"))).sendKeys("admin123");
	      driver.findElement(By.className(p.getProperty("butt"))).click();
	      
	      //Navigate to employee list
	      driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList/reset/1");
	      
	    //navigate to drop down
	     WebElement we=driver.findElement((By.id("empsearch_job_title")));
	     Select sc=new Select(we);
	     
	     
	     WebElement we1=driver.findElement(By.id("user_info_dropdown"));
	     Select sc1=new Select(we1);
	     
	     //select by index
	     sc.selectByIndex(4);
	     System.out.println(sc.getFirstSelectedOption().getText());
	     Thread.sleep(5000);
	     
	     
	     //select by value
	     sc.selectByValue("12");
	     System.out.println(sc.getFirstSelectedOption().getText());
	     Thread.sleep(5000);
	     
	     //selectByVisibility
	     sc.selectByVisibleText("EA");
	     System.out.println(sc.getFirstSelectedOption().getText());
	     Thread.sleep(5000);
	     
	      
	      
	      

	}

}
