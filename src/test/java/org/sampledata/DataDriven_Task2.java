package org.sampledata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Task2 {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\Saru\\eclipse-workspace\\Data\\src\\test\\java\\org\\sampledata\\Day4_Excel.xlsx");
	FileInputStream fil = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fil);
	Sheet s = w.getSheet("Sheet1");
	int noOfRows = s.getPhysicalNumberOfRows();
	System.out.println(noOfRows);
	Row row = s.getRow(0);
	int numberOfCells = row.getPhysicalNumberOfCells();
	System.out.println(numberOfCells);
	




}
}
