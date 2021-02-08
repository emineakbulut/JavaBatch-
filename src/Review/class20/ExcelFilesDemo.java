package Review.class20;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelFilesDemo {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Work\\eclipse-workspace\\JavaBatch8\\src\\Review\\class20\\Test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=workbook.getSheet("Sheet1");

        List<Person> allFileData=new ArrayList<>();
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row=sheet.getRow(i);
            Person person=new Person();
            person.setFirstName(row.getCell(0).toString());
            person.setLastName(row.getCell(1).toString());
            person.setAge( (int)row.getCell(2).getNumericCellValue());
            allFileData.add(person);
        }

        System.out.println(allFileData);

        fileInputStream.close();
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Row row = sheet.createRow(3);
        row.createCell(0).setCellValue("Merve");
        row.createCell(1).setCellValue("Serra");
        row.createCell(2).setCellValue("18");
        workbook.write(fileOutputStream);


    }
}

