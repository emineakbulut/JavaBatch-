package com.syntax.newClass37;
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

public class Task2 {

    public static void main(String[] args) throws IOException {

        String dataFile = "C:\\Users\\Work\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\newClass37\\Salary.xlsx";
        System.out.println(dataFile);
        FileInputStream fileInputStream = new FileInputStream(dataFile);
//creating 2 objects 1-to handle the inputfile 2-to handle outputfile
        XSSFWorkbook inputXSSFWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFWorkbook outputXSSFWorkbook = new XSSFWorkbook();

        Sheet sheet = inputXSSFWorkbook.getSheet("Sheet1");//reding data from sheet1

        List<MixedIndividuals> maleIndividualsList = new ArrayList<>();//cerating 2 list to hold male and female
        List<MixedIndividuals> femaleIndividualsList = new ArrayList<>();

        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {//iterating through all of the rows from sheet1(input file)
            Row rowData = sheet.getRow(i);//getting rows
            MixedIndividuals mixedIndividuals = new MixedIndividuals();//getting objects
            mixedIndividuals.setFirstName(rowData.getCell(0).getStringCellValue());
            mixedIndividuals.setLastName(rowData.getCell(1).getStringCellValue());
            mixedIndividuals.setAge((int) rowData.getCell(2).getNumericCellValue());
            mixedIndividuals.setGender(rowData.getCell(3).getStringCellValue().charAt(0));
            mixedIndividuals.setSalary(rowData.getCell(4).getNumericCellValue());

            if (mixedIndividuals.getGender() == 'M') {//depending upon the gender we stored all data to the list
                maleIndividualsList.add(mixedIndividuals);
            } else {
                femaleIndividualsList.add(mixedIndividuals);
            }
        }
//all of the data is in the memory now i can manupilate that data
        System.out.println(femaleIndividualsList);
        System.out.println(maleIndividualsList);

        fileInputStream.close();//closing the file because i want to perform some operations on the same file with the same name
        FileOutputStream genderOutputStream = new FileOutputStream(dataFile);//opening output connection

        List<MixedIndividuals> inputData=new ArrayList<>(maleIndividualsList);//creating a new list to hold all data from males and females
        inputData.addAll(femaleIndividualsList);

        XSSFSheet inputSheet = outputXSSFWorkbook.createSheet("Sheet1");

        XSSFRow row = inputSheet.createRow(0);

        row.createCell(0).setCellValue("FirstName");
        row.createCell(1).setCellValue("LastName");
        row.createCell(2).setCellValue("Age");
        row.createCell(3).setCellValue("Gender");
        row.createCell(4).setCellValue("Salary");

        for (int i =1 ; i < inputData.size(); i++) {
            row = inputSheet.createRow(i);

            row.createCell(0).setCellValue(inputData.get(i-1).getFirstName());
            row.createCell(1).setCellValue(inputData.get(i-1).getLastName());
            row.createCell(2).setCellValue(inputData.get(i-1).getAge());
            row.createCell(3).setCellValue(String.valueOf(inputData.get(i-1).getGender()));
            row.createCell(4).setCellValue(inputData.get(i-1).getSalary());
        }


        XSSFSheet outputMaleSheet = outputXSSFWorkbook.createSheet("Males");
        for (int i = 0; i < maleIndividualsList.size(); i++) {
            XSSFRow row1 = outputMaleSheet.createRow(i);

            row1.createCell(0).setCellValue(maleIndividualsList.get(i).getFirstName());
            row1.createCell(1).setCellValue(maleIndividualsList.get(i).getLastName());
            row1.createCell(2).setCellValue(maleIndividualsList.get(i).getAge());
            row1.createCell(3).setCellValue(String.valueOf(maleIndividualsList.get(i).getGender()));
            row1.createCell(4).setCellValue(maleIndividualsList.get(i).getSalary());
        }


        XSSFSheet outputFemaleSheet = outputXSSFWorkbook.createSheet("Females");
        for (int i = 0; i < femaleIndividualsList.size(); i++) {
            XSSFRow row2 = outputFemaleSheet.createRow(i);
            row2.createCell(0).setCellValue(femaleIndividualsList.get(i).getFirstName());
            row2.createCell(1).setCellValue(femaleIndividualsList.get(i).getLastName());
            row2.createCell(2).setCellValue(femaleIndividualsList.get(i).getAge());
            row2.createCell(3).setCellValue(String.valueOf(femaleIndividualsList.get(i).getGender()));
            row2.createCell(4).setCellValue(femaleIndividualsList.get(i).getSalary());
        }
        outputXSSFWorkbook.write(genderOutputStream);

    }

}

