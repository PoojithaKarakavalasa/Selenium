package keywordDrivenTesting;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KDT 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		LogoutPage lo=new LogoutPage(driver);
		
		String filepath="C:\\Users\\vinay\\OneDrive\\Desktop\\TestCasesExcel\\TestFile.xlsx";
		FileInputStream fis= new FileInputStream(filepath);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("keyword");
		int rowscount= sh.getLastRowNum();
		System.out.println("total no. of rows: "+rowscount);
		for(int r=1;r<=rowscount;r++)
		{
			XSSFRow row=sh.getRow(r);
			XSSFCell key=row.getCell(1);
			System.out.println("keywords--> "+key);
			
			switch(key.toString())
			{
		/*		case "url":lp.url();
							break;
				case "username":lp.userName(username.toString());
								break;
				case "password":lp.password(password.toString());
								break;
				case "login":   lp.clickOnLogin();
								break;
				case "clickImage":lo.clickOnImage();
									break;
				case "logout":	lo.clickOnlogout();
									break;
				default:System.out.println("Invalid data"); */
			}

		}
	}
}
