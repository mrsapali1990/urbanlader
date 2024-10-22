 package frameworks;

 import java.io.FileInputStream;
 import java.io.IOException;
 import org.apache.poi.ss.usermodel.Row;
 import org.apache.poi.xssf.usermodel.XSSFCell;
 import org.apache.poi.xssf.usermodel.XSSFSheet;
 import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 import java.io.FileInputStream;
 import org.apache.poi.xssf.usermodel.XSSFSheet;
 import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

 public class excel2 {

 	public static FileInputStream fis;
 	public static XSSFWorkbook wb;
 	public static XSSFSheet sheet;
 	public static String row;
 	public static XSSFCell cell;

 	public static void main(String[] args) throws IOException 
 	{

 		getCellData();
 	}

 	public static void getCellData() throws IOException
 	{
 		fis=new FileInputStream("E:\\selenium\\data2.xlsx");
 		wb=new XSSFWorkbook(fis);
 		sheet=wb.getSheet("Demo");

 		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

 		//Create a loop over all the rows of excel file to read it

 		for (int i = 0; i < rowCount+1; i++) {

 			Row row = sheet.getRow(i);

 			//Create a loop to print cell values in a row

 			for (int j = 0; j < row.getLastCellNum(); j++) {

 				//Print Excel data in console

 				System.out.print(row.getCell(j).getStringCellValue()+"|| ");

 			}

 			System.out.println();
 		}
 	}
 }