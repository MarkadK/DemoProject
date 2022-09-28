package com.baseClass;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public void  BeforeSuite()
	{
		DOMConfigurator.configure("log4j.xml");
		Log.info("This is BeforeSuitMethod");
	}
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Soft\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	@AfterSuite
	public void afterSuite()
	{
		Log.info("This is AfterSuitMethod");
	}
	
}
