package com.syntax.newClass36;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteExcel {
    public static void main(String[] args) throws IOException {

        String inputFilePath="C:\\Users\\Work\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\newClass36\\TestData.xlsx"; // filePath for input file
        String outputFilePath="C:\\Users\\Work\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\newClass36\\OutputData.xlsx"; //filePath for output file
//we are reding from a file writing to another file
        FileInputStream fileInputStream=new FileInputStream(inputFilePath); //creating the input stream to read the data
        FileOutputStream fileOutputStream=new FileOutputStream(outputFilePath); //creating the output stream to write the data
//input is what we want to put in our code,what we want to bring in our java code,inside the memory
//output is what we want to write on the disc
        XSSFWorkbook inputXSSFWorkbook=new XSSFWorkbook(fileInputStream); //used to manipulate the file with extension xlsx
        XSSFWorkbook outputXSSFWorkbook=new XSSFWorkbook(); // we don't need to specify the output stream in the constructor
//Why I am using 2 different objects??We are dealing with 2 files
//(inputXSSWorkbook) this object will hold the data the structure the complete file from which i will be reding the data
//(outputXSSWorkbook) this object will hold the file which i will be writing the data
//I am creating he objects of this xssfWorkbook to manipulate to handle 2 different excel files

        Sheet sheet=inputXSSFWorkbook.getSheet("PersonData");//i am getting the sheet from excel file
        List<PersonInfo> personInfoList=new ArrayList<>();
        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
            Row row=sheet.getRow(i);
            PersonInfo personInfo=new PersonInfo();
            personInfo.setFirstName(row.getCell(0).getStringCellValue());
            personInfo.setLastName(row.getCell(1).toString());
            personInfo.setAge((int)row.getCell(2).getNumericCellValue());
            personInfo.setSalary(row.getCell(3).getNumericCellValue());
            if(personInfo.getSalary()>100000){
                personInfoList.add(personInfo);
            }
        }

        System.out.println(personInfoList);

        XSSFSheet outputSheet = outputXSSFWorkbook.createSheet("OutputSheet");
        for (int i = 0; i < personInfoList.size(); i++) {
            XSSFRow row = outputSheet.createRow(i);
            PersonInfo personInfo = personInfoList.get(i);

            row.createCell(0).setCellValue(personInfo.getFirstName());
            row.createCell(1).setCellValue(personInfo.getLastName());
            row.createCell(2).setCellValue(personInfo.getAge());
            row.createCell(3).setCellValue(personInfo.getSalary());
        }

        outputXSSFWorkbook.write(fileOutputStream);

    }
}
