package testNG_EX;

import java.io.FileInputStream;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.Sheet;

public class TCOO2_EXCEL {
	 WebDriver driver;
	@BeforeClass
	public void burl()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("LAUNCH BROWSER");
		Reporter.log("LAUNCH BROWER");
	
		
	}
@AfterClass
	public void bclose()
	{
		driver.close();
		System.out.println("BROWSER CLOSE");
		Reporter.log("BROWSER CLOSE");
	}

@Test
     public void login() throws Exception
     {
    	 FileInputStream fis=new FileInputStream("E:\\Automation Testing\\LoginExcel.xls");
    	 Workbook wb=Workbook.getWorkbook(fis);
    	 Sheet s=wb.getSheet(0);
    	 String un=s.getCell(0,1).getContents();
    	 String pw=s.getCell(1,1).getContents();
    	 Reporter.log(un);
    	 Reporter.log(pw);
    	 
    	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    	 driver.findElement(By.name("txtUsername")).sendKeys(un);
 		 driver.findElement(By.name("txtPassword")).sendKeys(pw);
 		 driver.findElement(By.id("btnLogin")).click();
 		 System.out.println("LOGIN COMPLETED");
 		 Reporter.log("LOGIN COMPLETED");
 			
 		driver.findElement(By.id("welcome")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Logout")).click();
		 Thread.sleep(3000);

		 System.out.println("LOGOUT COMPLETED");
		 Reporter.log("LOGOUT COMPLETED");
		
     }

}
