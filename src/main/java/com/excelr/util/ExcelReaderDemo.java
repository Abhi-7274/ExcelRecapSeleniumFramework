package com.excelr.util;

import java.io.IOException;

import org.apache.poi.xssf.binary.XSSFBParser;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReaderDemo {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
    public static void main(String[] args) {
	String filepath ="./src/test/java/Testng/Book1.xlsx";
	try {
		wb = new XSSFWorkbook(filepath);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sheet = wb.getSheet("data");
	int rowcount = sheet.getPhysicalNumberOfRows();
	int colcount = sheet.getRow(0).getLastCellNum();
	
	
	

	
	
	
	
}


}

	
