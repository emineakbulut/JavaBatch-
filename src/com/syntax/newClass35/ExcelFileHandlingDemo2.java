package com.syntax.newClass35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileHandlingDemo2 {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\Work\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\newClass35\\Test.xlsx";
        System.out.println(path);

        FileInputStream fileInputStream=new FileInputStream(path); //creating connection
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream); //creating the object of XSSFworkbook to manipulate xlsx files
        Sheet sheet=workbook.getSheet("Sheet2"); //accessing the sheet
        Row row=sheet.getRow(1); //access the row by index
        Cell cell=row.getCell(2); //accessing the cells by index
        System.out.println(cell); //printing the results






    }
}
