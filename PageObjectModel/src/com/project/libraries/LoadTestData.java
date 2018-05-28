package com.project.libraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadTestData {

	FileInputStream fis;
	XSSFWorkbook wb;

	
	public ArrayList<String> LoadTestData()
	{
		try {
			FileInputStream fis = new FileInputStream("F://Temp Workspace//Practice//PageObjectModel//src//com//makemytrip//testdatafiles//TestData.xlsx");
			wb = new XSSFWorkbook(fis); 
		} catch (IOException e) {
			System.out.println("Test Data File not found");
			e.printStackTrace();
		}
		
		XSSFSheet sh=wb.getSheet("TestCaseData");
		ArrayList<String> dataList = new ArrayList<String>();
		
		for(int i=0; i<sh.getRow(1).getPhysicalNumberOfCells(); i++)
		{
			dataList.add(i, (sh.getRow(1).getCell(i).getStringCellValue()));
		}
		
		return dataList;
			
	}
	
}
