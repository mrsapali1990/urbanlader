package handlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelect {

    public static void main(String[] args) throws InterruptedException {

        //Creating instance of Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://www.globalsqa.com/demo-site/select-elements/");

        //Maximizing window
        driver.manage().window().maximize();
        
      //navigate to drop down
	     WebElement we=driver.findElement((By.id("selectable")));
	     Select sc=new Select(we);

        
     
                   
            System.out.println("Select option Opel ");
            sc.selectByVisibleText("Item 1");
            System.out.println(sc.getFirstSelectedOption().getText());
            

         
            System.out.println("Select option Item-2");
            sc.selectByVisibleText("Item 2");
            System.out.println(sc.getFirstSelectedOption().getText());

            // Selecting the option by text
            System.out.println("Select option Item-3");
            sc.selectByVisibleText("Item 3");
            System.out.println(sc.getFirstSelectedOption().getText());

            //Get the list of selected options
            System.out.println("The selected values in the dropdown options are -");

            List<WebElement> selectedOptions = sc.getAllSelectedOptions();

            for(WebElement selectedOption: selectedOptions)
                System.out.println(selectedOption.getText());

  
        

        driver.quit();
    }

}