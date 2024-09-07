package datadriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Inserttoexcel {

	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("E:\\testing workspace\\seleniumwebdriver\\Exceldata\\insert.xlsx");

		Workbook book = WorkbookFactory.create(fis);
			
		Sheet sheet = book.getSheet("Sheet1");
			
		Row row = sheet.createRow(6);

		Cell cel = row.createCell(6);
			
		cel.setCellValue("QSPIDERS");

		FileOutputStream fos = new FileOutputStream("E:\\testing workspace\\seleniumwebdriver\\Exceldata\\insert.xlsx");
		book.write(fos);
		book.close();

			
			}

		}