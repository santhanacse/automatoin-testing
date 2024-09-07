package datadriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Multivaluetoexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\testing workspace\\seleniumwebdriver\\Exceldata\\insettoexcel.xlsx");
		Workbook book=WorkbookFactory.create(file);
		Sheet sh=book.getSheet("Sheet3");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		List <WebElement> link=driver.findElements(By.xpath("//a"));
		for(int i=0;i<link.size();i++)
		{
			Row r=sh.createRow(i);
		Cell c=	r.createCell(3);
		c.setCellValue(link.get(i).getAttribute("href"));
		
		
		}


		FileOutputStream fos=new FileOutputStream("E:\\testing workspace\\seleniumwebdriver\\Exceldata\\insettoexcel.xlsx");
		book.write(fos);
		fos.close();
		}

}
