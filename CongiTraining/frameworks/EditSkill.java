package frameworks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditSkill {

	public static void main(String[] args) throws IOException, InterruptedException
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
			      
			      //open url
			      driver.get(p.getProperty("url"));
			      driver.manage().window().maximize();
			      //login
			      driver.findElement(By.name(p.getProperty("user"))).sendKeys("Admin");
			      driver.findElement(By.id(p.getProperty("pass"))).sendKeys("admin123");
			      driver.findElement(By.className(p.getProperty("butt"))).click();
			      
			      //navigate to skill page
			      driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSkills");
			      //read file
			     File f1=new File("C:\\Users\\Tathagat\\eclipse-workspace\\OrangeHRM\\skillRead.csv");
			     FileReader fr1=new FileReader(f1.getAbsoluteFile());
			     BufferedReader br1=new BufferedReader(fr1);
			     //write file
			     
			     File f2=new File("C:\\Users\\Tathagat\\eclipse-workspace\\OrangeHRM\\skillWrite.csv");
			     FileWriter fw=new FileWriter(f2.getAbsoluteFile());
			     BufferedWriter bw=new BufferedWriter(fw);
			     //read file
			     String line=br1.readLine();
			     String[] data=line.split(",");
			     driver.findElement(By.linkText(data[0])).click();
			     Thread.sleep(5000);
			     WebElement we=driver.findElement(By.id("skill_name"));
			     we.clear();
			    
			     we.sendKeys(data[1]);
			     WebElement we1=driver.findElement(By.id("skill_discription"));
			     we1.clear();
			     we1.sendKeys("Automation");
			     
			     driver.findElement(By.id("btnSave")).click();
			     //checkpoint
			     boolean found1=driver.getPageSource().contains("TestCases");
			     boolean found2=driver.getPageSource().contains("Selenium");
			     if((found1==false)&&(found2==true))
			     {
			    	 bw.write("skill edited successfully");
			    	 
			     }
			     else
			     {
			    	 bw.write("skill not edited successfully");
			     }
			     
			    bw.close();
			    //logout
			       driver.findElement(By.partialLinkText(p.getProperty("wel"))).click();
			      driver.findElement(By.linkText(p.getProperty("log"))).click();
			       //close 
			       driver.close();
			    
			     		
			     
			     	

			     
			    		 
			    		 
			    		 
			    		 
			    		 
			     
	}

}
