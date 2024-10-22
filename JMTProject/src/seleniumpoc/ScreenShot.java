package seleniumpoc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot {

    public static void main(String[] args) throws IOException, InterruptedException {
        

        System.setProperty("webdriver.chrome.driver", "E:\\SoftwareJMT\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");
        
        //String d=RandomString.make(3);
        
        Thread.sleep(2000);
        
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File destn=new File("C:\\Users\\Tathagat\\eclipse-workspace\\JMTProject\\ScreenShot\\sc.png");
        
        FileHandler.copy(file, destn);
        
        driver.quit();
        
    }

}