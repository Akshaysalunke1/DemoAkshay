package readexceldata;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldata {

	public static void main(String[] args) throws 
		            
		       FileInputStream fis = new FileInputStream ("C:\\Users\\DELL\\Desktop\\wsca\\sel\\drivers\\data");//provide the excel
		     Workbook wb = WorkbookFactory.create(fis);
		      sheet sheet = wb.getsheet("IPL");//take sheet name
		    
		    Row row  = sheet.getRow(7);//get value of row by passing argument
		    Cell cell = row.getCell(2);//get value of cell
		      String data = cell.getStringCellValue();//it will give the value present in cell
		      System.out.println(data);
	}

}
