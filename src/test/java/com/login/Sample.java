package com.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
public static void main(String[] args) throws IOException {

File file = new File("C:\\Users\\ELCOT\\Pictures\\excel 1.xlsx");
FileInputStream stream = new FileInputStream(file);
Workbook workbook = new XSSFWorkbook(stream);
Sheet sheet = workbook.getSheet("excel1");
Row row = sheet.getRow(0);
Cell cell = row.getCell(0);

System.out.println(cell);




}
}
