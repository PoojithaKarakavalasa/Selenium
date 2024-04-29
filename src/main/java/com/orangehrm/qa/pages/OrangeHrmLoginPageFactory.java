package com.orangehrm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLoginPageFactory 
{
	public WebDriver driver;
	public OrangeHrmLoginPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath=("//button[@type='submit']")) WebElement loginbutton;

	public void url() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	public void enterusername(String un)
	{
		username.sendKeys(un);
	}
	public void enterpass(String pass)
	{
		password.sendKeys(pass);
	}
	public void login()
	{
		loginbutton.click();
	}





}
