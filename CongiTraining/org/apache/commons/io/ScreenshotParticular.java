package org.apache.commons.io;

import java.awt.image.BufferedImage;
import java.awt.image.RasterFormatException;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenshotParticular 
{
    public static void main(String[] args) throws IOException, InterruptedException 
    {
        System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.pexels.com/search/Joker/");
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div[1]/article/a[1]/img"));
        element1.click();
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div/div/section[1]"));
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullimg = ImageIO.read(screenshot);  
        Point point = element.getLocation();
        int elewidth = element.getSize().getWidth();
        int eleheight = element.getSize().getHeight();
        try{
            BufferedImage elementScreenshot = fullimg.getSubimage(point.getX(), point.getY(), elewidth, eleheight);
            ImageIO.write(elementScreenshot, "png", screenshot);
        }
        catch(RasterFormatException ignoRasterFormatException)
       {
            System.out.println("Ignore Exception");
       }
       org.apache.commons.io.FileUtils.copyFile(screenshot, new File("E:\\selenium\\screenshot\\particularElementScreenshot.PNG"));
       Thread.sleep(4000);
       driver.close();
   }
}