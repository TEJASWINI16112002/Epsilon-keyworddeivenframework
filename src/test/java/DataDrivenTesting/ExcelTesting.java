package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTesting {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//step1:open the file in jave readable format
		FileInputStream fis=new FileInputStream("C:\\Users\\stejas\\eclipse-workspace\\Epsilon.Selenium\\src\\test\\resources\\data.xlsx");
		
				
		//create a workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		//navigate to the required sheet
		Sheet sh=wb.getSheet("Sheet1");
		
		//navigate to required row
		Row rw=sh.getRow(2);
		
		//navigate to required cell
		Cell cl=rw.getCell(0);
		
		
		//capture the data in the cell
		String value=cl.getStringCellValue();
		System.out.println(value);
		
		
		
		
		
		
		
		
	}

}
