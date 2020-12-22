package com.syntax.newClass35;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileHandlingDemo4 {

    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Work\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\newClass36\\TestData.xlsx";

        System.out.println(path); //path to the file
        FileInputStream fileInputStream=new FileInputStream(path); //creating connection
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream); //creating the object of XSSFworkbook to manipulate xlsx files
        Sheet sheet=workbook.getSheet("FirstPage"); //accessing the sheet
        for (int row = 0; row < sheet.getPhysicalNumberOfRows(); row++) {
            Row rowData=sheet.getRow(row); //getting the rows one by one using the outer loop
            for (int j = 0; j <rowData.getPhysicalNumberOfCells() ; j++) {
                System.out.print(rowData.getCell(j)+"  "); //getting the cells one by one using inner loop
            }
            System.out.println();
            /*String firstName=row.getCell(0).getStringCellValue();
            String lastName=row.getCell(1).getStringCellValue();
            String hobby=row.getCell(2).getStringCellValue();
            int age= (int) row.getCell(3).getNumericCellValue();
            int age2= Integer.parseInt( row.getCell(3).getStringCellValue());*/
        }

    }
}