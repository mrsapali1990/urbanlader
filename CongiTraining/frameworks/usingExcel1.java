package frameworks;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingExcel1 {

	public static void main(String[] args) throws Exception {
		// This is for Taking file as a Input
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("E:\\selenium\\data1.xlsx"));

		// Reading Sheet
		XSSFSheet sh = wb.getSheet("Sheet1");

		// Reading Data
		// String pwd = sh.getRow(1).getCell(1).toString();
		// System.out.println(pwd);
		// Printing How many rows are there
		int rowNum = sh.getLastRowNum();
		System.out.println("Index of Last row is " + rowNum);

		int colNum = sh.getRow(0).getLastCellNum(); // It will return actual Number of Col Not index
		System.out.println("Index of Last Col is " + colNum);

		//Launch
				System.setProperty("webdriver.chrome.driver","E:\\software\\chromedriver\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		for (int i = 0; i <= rowNum; i++) {
			String un = sh.getRow(i).getCell(0).toString();
			String pwd = sh.getRow(i).getCell(1).toString();
			System.out.print(un + " ");
			System.out.println(pwd);
			driver.findElement(By.id("txtUsername")).sendKeys(un);
			driver.findElement(By.id("txtPassword")).sendKeys(pwd);
			driver.findElement(By.id("btnLogin")).click();

			if (driver.getCurrentUrl().contains("dashboard")) {
				Thread.sleep(2000);
				driver.findElement(By.id("welcome")).click();
				Thread.sleep(1000);
				driver.findElement(By.linkText("Logout")).click();
				System.out.println("Login Process Done");
			} else {
				System.out.println("Login Process Failed");
			}
		}
	}
}