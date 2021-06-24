package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrms.utility.Log;


public class General extends Global {
	
	
		//RE-USABLE FUNCTION
	    WebDriver driver;

	    @BeforeClass
	    public void openApplication()
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\webdrivers\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.navigate().to(url);
			System.out.println("APPLICATION OPEN");//console
			Reporter.log("APPLICATION OPEN");//html report
			Log.info("APPLICATION OPEN");//log file
		}
	    
	    @AfterClass
		public void closeApplication() throws Exception
		{
	
			driver.close();
			System.out.println("APPLICATION CLOSE");
			Reporter.log("APPLICATION CLOSE");
			Log.info("APPLICATION CLOSE");


		}
		
		@Test
		public void login()
		{
			driver.findElement(By.name(txt_loginname)).sendKeys(un);
			driver.findElement(By.name(txt_password)).sendKeys(pw);
			driver.findElement(By.name(btn_login)).click();
			System.out.println("LOGIN COMPLETED");
			Reporter.log("LOGIN COMPLETED");
			Log.info("LOGIN COMPLETED");


		}
		
		@Test
		public void logout() throws Exception
		{
			
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText(link_logout)).click();
			Thread.sleep(3000);

			System.out.println("LOGOUT COMPLETED");
			Reporter.log("LOGOUT COMPLETED");
			Log.info("LOGOUT COMPLETED");

			
			
		}
		
		//mouseover
		
		@Test	
	public void pim()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText(link_pim))).perform();
		System.out.println("MOUSEOVER COMPLETED");
		Reporter.log("MOUSEOVER COMPLETED");
		Log.info("MOUSEOVER COMPLETED");

	}
	
		@Test	
	public void addemployee() 
	{
		driver.findElement(By.linkText(link_addemployee)).click();
		System.out.println("CLICKED ON SUBMENU");
		driver.findElement(By.name(txt_firstname)).sendKeys(fn);
		driver.findElement(By.name(txt_middlename)).sendKeys(mn);
		driver.findElement(By.name(txt_lastname)).sendKeys(ln);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("EMPLOYEE ADD SUCCESSFULLY");
		Reporter.log("EMPLOYEE ADD SUCCESSFULLY");
		Log.info("EMPLOYEE ADD SUCCESSFULLY");

	}

}
