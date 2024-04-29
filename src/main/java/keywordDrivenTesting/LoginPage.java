package keywordDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	public  WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//repository of all locators
	By username=By.name("username");
	By password=By.name("password");
	By loginbutton=By.xpath("//button[@type='submit']");

	public void url() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	public void enterusername(String un)
	{
		driver.findElement(username).sendKeys(un);
	}
	public void enterpass(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void login()
	{
		driver.findElement(loginbutton).click();
	}
	
}
