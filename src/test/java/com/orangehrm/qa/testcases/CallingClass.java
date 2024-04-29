package com.orangehrm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orangehrm.qa.pages.LoginPage;
import com.orangehrm.qa.pages.OrangeHrmLoginPageFactory;

public class CallingClass 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		driver=new ChromeDriver();
		
/*		LoginPage lp=new LoginPage(driver);
		lp.url();
		lp.enterusername("admin");
		lp.enterpass("admin123");
		lp.login();
*/		
		OrangeHrmLoginPageFactory pf=new OrangeHrmLoginPageFactory(driver);
		pf.url();
		pf.enterusername("admin");
		pf.enterpass("admin123");
		pf.login();
	}
}
