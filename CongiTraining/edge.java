import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;


public class edge {

	
			public static void main(String[] args) 
			{
				
				System.setProperty("webdriver.edge.driver", "E:\\software\\edgedriver\\msedgedriver.exe");
				WebDriver driver = new EdgeDriver();
				driver.get("https://www.google.co.in/");
				
				// TODO Auto-generated method stub

			}

		

}
