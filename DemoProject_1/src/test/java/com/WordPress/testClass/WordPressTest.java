package com.WordPress.testClass;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseClass.BaseClass;
import com.baseClass.Log;

public class WordPressTest extends BaseClass{

	@Test
	public void wordPressTest() throws InterruptedException
	{
		Log.startTestCase("wordPressTest");
		
		Log.info("Entering User name");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Log.info("Entering Password");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Log.info("Clicking on login button");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Log.info("Entering on Home PAge");
		Log.info("Verifing Home PAge URL");
		String actURL=driver.getCurrentUrl();		
		String expURL="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		Assert.assertEquals(actURL, expURL);
		Log.info("URL Matches");
		Log.endTestCase("wordPressTest");
	}
	
}
