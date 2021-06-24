package testNG_EX;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC003_SS {
	
	 WebDriver driver;
	 
	@BeforeClass
	public void bopen()
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		System.out.println("LAUNCH BROWSER");
	}
	
	@AfterClass
	public void bclose()
	{
		driver.close();
		System.out.println("BROWSER CLOSE");
		
	}
	
	@Test
	public void screenshot() throws IOException
	{
	try
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("APPLICATION OPEN");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
 		driver.findElement(By.id("btnLogin")).click();
        System.out.println("LOGIN COMPLETED");
        Reporter.log("LOGIN COMPLETED");
        Thread.sleep(3000);
        
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b"))).perform();
        driver.findElement(By.linkText("Add Employee123")).click();
        System.out.println("CLICK ON SUBMENU");
        Reporter.log("CLICK ON SUBMENU");
	}
	
	catch(Exception e)
	{
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1,new File("E:\\Automation Testing\\TestResult.png"));
	}

	}
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

	
