//package com.sn.Utility;
//
//import java.io.File;
//import java.util.logging.FileHandler;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//public class Utility {public static void captureScreenshot(WebDriver driver,String screenshotName)
//{
//
//try 
//{
//TakesScreenshot ts=(TakesScreenshot)driver;
//
//File source=ts.getScreenshotAs(OutputType.FILE);
//
//FileHandler.copy(source, new File("./Screenshots/"+screenshotName+".png"));
//
//System.out.println("Screenshot taken");
//} 
//catch (Exception e)
//{
//
//System.out.println("Exception while taking screenshot "+e.getMessage());
//} 
//}
//
//
//}
