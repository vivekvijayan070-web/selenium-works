package utils_pkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilExel {
	
	public static Object[][] getTestData(String filepath,String sheetName)throws IOException{
		FileInputStream fis=new FileInputStream(filepath);//read excelpath
		XSSFWorkbook workbook=new XSSFWorkbook(fis);//get excel workbook
		XSSFSheet sheet=workbook.getSheet(sheetName);//to get the sheet 
		
		int rows =sheet.getLastRowNum();//ecxcluding header
		int cols=sheet.getRow(0).getLastCellNum();
		
		System.out.println(rows);
		System.out.println(cols);
		
		Object[][] data=new Object[rows][cols];
		DataFormatter formatter=new DataFormatter();
		
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				data[i-1][j]= formatter.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		workbook.close();
		fis.close();
		return data;
	}
}














