package org.apache.commons.io;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.TakesScreenshot;
import  org.openqa.selenium.WebDriver;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import org.openqa.selenium.OutputType;
import java.io.File;

import java.io.IOException;
//import io.github.bonigarcia.wdm.WebDriverManager;//



@SuppressWarnings("unused")
public class FileUtils
{
    private static Object driver;

	public static void main(String[] args)throws IOException
    
    {
        //set the location of chrome browser
        System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver\\chromedriver.exe");
        
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        
        //navigate to url
        driver.get("http://ensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        //full page screen shot
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("E:\\selenium\\screenshot\\homepage.png"));
        
          ((ChromiumDriver) FileUtils.
        
        
        		
             
        driver).quit();
    }

	public static void copyFile(File srcFile, File destFile) {
		// TODO Auto-generated method stub
		
	}

	
	

	

	
}

