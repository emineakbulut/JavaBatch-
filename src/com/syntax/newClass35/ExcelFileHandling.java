package com.syntax.newClass35;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileHandling {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Work\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\newClass35\\Test.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);

        Workbook workbook=new XSSFWorkbook(fileInputStream);
      //  Sheet sheet=workbook.getSheet("FirstPage");
      //  Row row=sheet.getRow(0);
    //    Cell cell=row.getCell(0);
    //    System.out.println(cell.toString());
    }
}
