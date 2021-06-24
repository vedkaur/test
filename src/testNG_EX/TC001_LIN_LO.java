package testNG_EX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TC001_LIN_LO {
	
	WebDriver driver;
    @BeforeClass
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("APPLICATION OPEN");
		Reporter.log("APPLICATION OPEN");
	}
    
	@AfterClass
	public void closeApplication() throws Exception
	{

		driver.close();
		System.out.println("APPLICATION CLOSE");
		Reporter.log("APPLICATION CLOSE");

	}
	
	@Test
	public void login()
	{
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("LOGIN COMPLETED");
		Reporter.log("LOGIN COMPLETED");


	}
	
	@Test
	public void logout() throws Exception
	{
		
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);

		System.out.println("LOGOUT COMPLETED");
		Reporter.log("LOGOUT COMPLETED");
		
		
	}


}
