package com.syntax.newClass36;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ReadingExcelFile {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Work\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\newClass36\\TestData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream); //used to manipulate the file with extension xlsx
        Sheet sheet=xssfWorkbook.getSheet("PersonData");

        List<PersonInfo> personInfoList=new ArrayList<>();//creating a list
        for (int i = 1; i <sheet.getPhysicalNumberOfRows(); i++) {//this loop will keepon iterating unless we are done with all the rows
            Row row=sheet.getRow(i);//it will go for the first row and
            PersonInfo personInfo=new PersonInfo();//will create an object for that row
            personInfo.setFirstName(row.getCell(0).getStringCellValue());//it will create all of the data from that row
            personInfo.setLastName(row.getCell(1).toString());
            personInfo.setAge((int)row.getCell(2).getNumericCellValue());
            personInfo.setSalary(row.getCell(3).getNumericCellValue());
            personInfoList.add(personInfo);

        }

        System.out.println(personInfoList);



    }
}
