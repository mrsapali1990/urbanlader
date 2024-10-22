package excel.data.Pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadSpecificData {
	 
    public static void main(String[] args) {
         
     String path = "C:\\ExcelData\\PracticeExcel.xlsx";    
 
        try {
             
            //Create an object of FileInputStream class to read excel file
            FileInputStream fis = new FileInputStream(path);
             
            //Create object of XSSFWorkbook class
            XSSFWorkbook wb = new XSSFWorkbook(fis);
             
            //Read excel sheet by sheet name 
            XSSFSheet sheet1 = wb.getSheet("Read_TestData");
             
            //Get data from specified cell
            System.out.println(sheet1.getRow(1).getCell(1).getStringCellValue());
            System.out.println(sheet1.getRow(3).getCell(0).getStringCellValue());
             
        } catch (IOException e) {
            e.printStackTrace();
        }   
 
    }
 
}