package apr_22;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDemo 
{
	/*
	 * 1.declare a path
	 * 2.load the file
	 * 3.load workbook
	 * 4.load sheet from workbook
	 * 5.identify total no. of rows
	 * 6.fetch the data from the rows
	 *
	 * */
	public static void main(String[] args) throws Exception 
	{
		//give the path  for file
		String filepath="C:\\Users\\vinay\\OneDrive\\Desktop\\TestCasesExcel\\TestFile.xlsx";
		//load the file
		FileInputStream fis=new FileInputStream(filepath);
		//load the workbook
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		//load sheet
		XSSFSheet sh = wb.getSheet("Data");
		XSSFRow row=sh.getRow(0);
		int rowscount= sh.getLastRowNum();
		System.out.println("total no. of rows: "+rowscount);
		int cellcount= sh.getRow(0).getLastCellNum();
		System.out.println("total cells: "+cellcount);
		String un=row.getCell(0).getStringCellValue();
		String pass=row.getCell(1).getStringCellValue();
		System.out.print(un+"====>"+pass);
/*		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(3).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(3).getCell(1).getStringCellValue());
 */		for(int r=0;r<rowscount;r++)
		{
			for(int c=0;c<cellcount;c++)
			{
				System.out.println(sh.getRow(r).getCell(c).getStringCellValue());
			}
		}
	}
}
