package frameworks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleDDT
{

	public static void main(String[] args) throws IOException
	{
					//Launch
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
			      			      
			      // Read data from csv file
			      BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\Tathagat\\eclipse-workspace\\OrangeHRM\\singlelogin.csv"));
			      
			      // read line by line
			      String line=br.readLine();
			      String[] data=line.split(",");
			      //login
			      driver.findElement(By.name(p.getProperty("user"))).sendKeys(data[0]);
			      driver.findElement(By.id(p.getProperty("pass"))).sendKeys(data[1]);
			      driver.findElement(By.className(p.getProperty("butt"))).click();
			      
			      //logout
			       driver.findElement(By.partialLinkText(p.getProperty("wel"))).click();
			      driver.findElement(By.linkText(p.getProperty("log"))).click();
			       //close 
			       driver.close();
	}

}
