package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDriven {
	
	@Test
	public static String[][] readExcel(String filename) throws IOException
	{
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\ADMIN\\eclipse-workspace\\com.OrangeHRM\\"+filename+".xlsx");
		
		XSSFSheet sheet=book.getSheetAt(0);
		
		int lastrow=  sheet.getLastRowNum();
		
		System.out.println(lastrow);
		
		int lastcol = sheet.getRow(0).getLastCellNum();
		
		System.out.println(lastcol);
		
		String [][] data = new String [lastrow][lastcol];
		
		for(int i=1;i<=lastrow;i++) {
			XSSFRow row2 = sheet.getRow(i);
			for(int j=0;j<lastcol;j++)
			{
				String value=sheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.println(value);
				
				data[i-1][j]=value;
				
			}
			
		}
		
		book.close();
		
		return data;
		
		
		
		
		
	}

	

}
