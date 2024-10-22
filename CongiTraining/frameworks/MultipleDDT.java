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

public class MultipleDDT {

	public static void main(String[] args) throws IOException, Exception
	{
		//Launch
		System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    String validUser="Admin";
	    String validPass="admin123";
	    String expMsg="Invalid credintial";
	    
	    //implicit wait
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    //read properties file
	      Properties p=new Properties();
	      FileInputStream f=new FileInputStream("C:\\Users\\Tathagat\\eclipse-workspace\\OrangeHRM\\Login.properties");
	      p.load(f);
	      
	      // Read data from csv file
	      BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\Tathagat\\eclipse-workspace\\OrangeHRM\\singlelogin.csv"));
	      
	      // read line by line
	      String line=br.readLine();
	      
	      //reading multiple data
	      while(line!=null)
	      {
	    	  driver.get(p.getProperty("url"));
	    	  driver.manage().window().maximize();
	    	  String[] data=line.split(",");
	    	  System.out.println(data[0]);
	    	  System.out.println(data[1]);
	    	//login
		      driver.findElement(By.name(p.getProperty("user"))).sendKeys(data[0]);
		      driver.findElement(By.id(p.getProperty("pass"))).sendKeys(data[1]);
		      driver.findElement(By.className(p.getProperty("butt"))).click();
		      //checkpoint
		      if((data[0].trim().equalsIgnoreCase(validUser))&&(data[1].trim().equalsIgnoreCase(validPass))) {
		    	  
		    	//logout
			       driver.findElement(By.partialLinkText(p.getProperty("wel"))).click();
			      driver.findElement(By.linkText(p.getProperty("log"))).click();	      	    
	    	  
	      }
	      
	      else
	      {
	      String actMsg=driver.findElement(By.id("spanMessage")).getText();
	      
	      if(expMsg.contentEquals(actMsg)) {
	    	  System.out.println("Test passed for invalid credentital" );
	      }
	      else
	      {
	    	  System.out.println("Test failed for invalid credentital" );
	}
	
	      
}
		      Thread.sleep(5000);
		      line=br.readLine();
	      }
	      driver.close();
	}
}
