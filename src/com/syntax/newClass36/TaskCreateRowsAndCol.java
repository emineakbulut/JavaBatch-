package com.syntax.newClass36;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class TaskCreateRowsAndCol {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:\\Users\\FS\\Desktop\\Test\\TaskRows.xlsx";
        String outputFilePath = "C:\\Users\\FS\\Desktop\\Test\\TaskRowsOutput.xlsx";
        FileInputStream fileInputStream = new FileInputStream(inputFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);
        XSSFWorkbook inputXSSWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFWorkbook outputXSSWorkbook = new XSSFWorkbook();//we dont need to specify the output stream in the constructor
        Sheet sheet = inputXSSWorkbook.getSheet("Task");
        List<PersonInfo> personInfoList = new ArrayList<>();
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            PersonInfo personInfo = new PersonInfo();
            Cell cell = row.getCell(0);
            personInfo.setFirstName(row.getCell(0).getStringCellValue());//can use this method
            personInfo.setLastName(row.getCell(1).toString());//or this method
            personInfo.setAge((int)row.getCell(2).getNumericCellValue());
            personInfo.setSalary(row.getCell(3).getNumericCellValue());
            if (personInfo.getSalary()>100000){
                personInfoList.add(personInfo);
            }
        }
        System.out.println(personInfoList);
        outputXSSWorkbook.createSheet("OutputSheet");
        for (int i = 0; i < personInfoList.size(); i++) {
        }
    }
}
