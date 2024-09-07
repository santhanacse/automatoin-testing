package datadriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Inserttoexcel_my {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\testing workspace\\seleniumwebdriver\\Exceldata\\insettoexcel.xlsx");
		Workbook book=WorkbookFactory.create(file);
		 Sheet sh= book.getSheet("Sheet1");
	Row r=	 sh.createRow(2);
		 
	Cell c=	r.createCell(4);
	 c.setCellValue("santhana Aravind");
		FileOutputStream fos=new FileOutputStream("E:\\testing workspace\\seleniumwebdriver\\Exceldata\\insettoexcel.xlsx");
		book.write(fos);
		book.close();

	}

}

