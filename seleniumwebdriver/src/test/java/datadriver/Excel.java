package datadriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException  {
		FileInputStream file=new FileInputStream("E:\\testing workspace\\seleniumwebdriver\\Exceldata\\cardetails.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
XSSFSheet sh=wb.getSheet("Sheet1");
// count no of rows and cells
int row=sh.getLastRowNum();
int tot=sh.getRow(0).getLastCellNum();
System.out.println("no of row"+ row);
System.out.println("no of row"+ tot);
for(int r=0;r<=row;r++)
{
	XSSFRow cr=sh.getRow(r);	
	for(int c=0;c<tot;c++)
	{
		XSSFCell cel=cr.getCell(c);
		System.out.print(cel.toString()+"\t");
	}
	System.out.println("\n");
}

	wb.close();
	file.close();
		
		
		
		
	}

}
