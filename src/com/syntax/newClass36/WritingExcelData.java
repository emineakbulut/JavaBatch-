package com.syntax.newClass36;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcelData {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Work\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\newClass36\\OutputData.xlsx";
        System.out.println(path);
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        XSSFSheet outputData = xssfWorkbook.createSheet("OutputData");
        XSSFRow row = outputData.createRow(0);
        XSSFCell cell = row.createCell(0);
        cell.setCellValue("Test");
        xssfWorkbook.write(fileOutputStream);


    }
}
