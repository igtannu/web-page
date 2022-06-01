package com.Android.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsReader extends BasePage {
	
	public static String readExcel(int a, int b) throws IOException {
		//Create an object of File class to open xlsx file
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Trial.xlsx");

		//Create an object of FileInputStream class to read excel
		FileInputStream fis = new FileInputStream(file);

		//Creating workbook instance that refers to .xls file
		XSSFWorkbook wb=new XSSFWorkbook(fis);

		//Creating a Sheet object using the sheet Name
		XSSFSheet sheet=wb.getSheet("Tanu");
		
		String Data= (sheet.getRow(a).getCell(b)).toString();

		return Data;
		}

}
