package org.sampledata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Task3 {
	public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\Saru\\eclipse-workspace\\Data\\src\\test\\java\\org\\sampledata\\Day4_Excel.xlsx");
	FileInputStream fil = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fil);
	Sheet s = w.getSheet("Sheet1");  
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row row = s.getRow(i);
	
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		
		System.out.println(cell);
	}
	
	
	
	}
	}
}
