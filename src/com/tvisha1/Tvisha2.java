package com.tvisha1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Tvisha2{

 WebDriver driver;
 public static XSSFWorkbook _workbook;
 public static XSSFSheet _sheet;
 public static XSSFRow _row;
 public static XSSFCell _cell;

   @DataProvider(name="tk")
   
   public static Object[][] ttt_1() throws InterruptedException, IOException{
	Thread.sleep(1000);
	FileInputStream fileinput=new FileInputStream(new File("C:\\Users\\SatishTvisha\\Desktop\\sathish.xlsx"));
 	_workbook=new XSSFWorkbook(fileinput);
 	_sheet=_workbook.getSheet("Sheet1");
 	int rows_count=_sheet.getPhysicalNumberOfRows();
 	System.out.println("rows   "  +rows_count);
 	int cells_count=_sheet.getRow(0).getPhysicalNumberOfCells();
 	System.out.println("cell count "+cells_count);
 	
 	Object reg[][]=new Object[rows_count][cells_count];
 	
 	for(int i=0;i<rows_count;i++){
 		
 		for(int j=0;j<cells_count;j++){
 		   reg[i][j]=_sheet.getRow(i).getCell(j).getStringCellValue();
 		    System.out.println(reg[i][j]);
 		    
 		}
 	}
 	return reg;
	}
 
  public void getCellTypr(){}
  
  
 
}
