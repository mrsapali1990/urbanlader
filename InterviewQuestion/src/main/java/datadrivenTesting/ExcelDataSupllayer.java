package datadrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExcelDataSupllayer {
	@DataProvider(name="logintestData")
	public  String[][] getData() throws IOException {
		//Create a file instance
		File excelFile=new File(".\\src\\main\\java\\testData\\Test.xlsx");
		System.out.println(excelFile);		
		//create a raw dada and reading a raw data from file instance
		FileInputStream fis=new FileInputStream(excelFile);
		//converting raw data into excelworkbook  format
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//from workbook i m getting sheet and from this sheet i need to get the rows
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int noOfRows=sheet.getPhysicalNumberOfRows();
		int noOfCols=sheet.getRow(0).getLastCellNum();
		String data[][]=new String[noOfRows-1][noOfCols];
		for(int i=0;i<noOfRows-1;i++)
		{
			for(int j=0;j<noOfCols;j++)
			{
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
			workbook.close();
			fis.close();
		}
		
		return data;
		
		
	}

}
