package dataDrivenTesting;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String filepath="C:\\Users\\vinay\\OneDrive\\Desktop\\TestCasesExcel\\TestFile.xlsx";
		FileInputStream fis= new FileInputStream(filepath);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Data");
		int rowscount= sh.getLastRowNum();
		System.out.println("total no. of rows: "+rowscount);
		for(int r=0;r<rowscount;r++)
		{
			XSSFRow row=sh.getRow(r);
			XSSFCell username=row.getCell(0);
			XSSFCell password=row.getCell(1);
			System.out.println(username+"---->"+username);
		try {
			driver.findElement(By.name("username")).sendKeys(username.toString());
			driver.findElement(By.name("password")).sendKeys(password.toString());
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("valid data");
			}
		catch(Exception e)
		{
			System.out.println("invalid data");
		}
	 }
	}
}
