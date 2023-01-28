package Keydrivenframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

    public class flib {

	
		public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException 
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = (Sheet) wb.getSheet(sheetName);
			Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(rowCount);
			Cell cell = row.getCell(cellCount);
			String data = cell.getStringCellValue();
			return data;	
			} 
	 
			                         //to get row count
			                         
			  public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException 
			     {
			           FileInputStream fis = new FileInputStream(excelPath);	
			        	Workbook wb = WorkbookFactory.create(fis);
			                  Sheet sheet = (Sheet) wb.getSheet(sheetName);
			          		int rc = ((org.apache.poi.ss.usermodel.Sheet) sheet).getLastRowNum();
			                  return rc;
			                     	}
			  
			          //write excle data
			  
			  
			  public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
				{
				      FileInputStream fis = new FileInputStream(excelPath);	
				        Workbook wb = WorkbookFactory.create(fis);
				        Sheet sheet = (Sheet) wb.getSheet(sheetName);
				        Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(rowCount);
				        Cell cell = row.createCell(cellCount);
				        cell.setCellValue(data);
				        
				        FileOutputStream fos = new FileOutputStream(excelPath);
				      wb.write(fos);
		
	}


}
