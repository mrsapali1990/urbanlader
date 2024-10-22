package handlingTables;

	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class dropDown {

	    public static void main(String[] args) throws InterruptedException {

	        //Creating instance of Chrome driver
	        WebDriver driver = new ChromeDriver();

	        //Step#2- Launching URL
	        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

	        //Maximizing window
	        driver.manage().window().maximize();

	        //Step#3- Selecting the dropdown element by locating its id
	        Select select = new Select(driver.findElement(By.tagName("select")));

	        //Step#4- Printing the options of the dropdown
	        //Get list of web elements
	        List<WebElement> lst = select.getOptions();

	        //Looping through the options and printing dropdown options
	        System.out.println("The dropdown options are:");
	        for(WebElement options: lst)
	            System.out.println(options.getText());

	        
	        System.out.println("Select the Option by Index 4");
	        select.selectByIndex(4);
	        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

	        
	        System.out.println("Select the Option by Text India");
	        select.selectByVisibleText("India");
	        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

	        // Selecting an option by its value
	        System.out.println("Select the Option by value 6");
	        select.selectByValue("6");
	        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

	        driver.quit();
	    }

	}