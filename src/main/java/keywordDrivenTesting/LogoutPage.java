package keywordDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage 
{
	public WebDriver driver;
	public LogoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By image=By.xpath("//p[@class='oxd-userdropdown-name']");
	By logoutbutton=By.linkText("Logout");
	public void ClickOnImage() throws InterruptedException 
	{
		driver.findElement(image).click();
		Thread.sleep(2000);
	}
	public void clickOnLogout()
	{
		driver.findElement(logoutbutton).click();
	}



}
