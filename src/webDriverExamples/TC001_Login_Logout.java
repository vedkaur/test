package webDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC001_Login_Logout 
{
	public static void main(String args[]) throws Exception
	{
		//                  BROWSER EXE FILE          PATH OF EXE FILE IN LOCAL SYSTEM
		System.setProperty("webdriver.gecko.driver","F:\\webdrivers\\geckodriver-v0.29.1-win64\\geckodriver.exe" ); 
		
		//OBJECT CREATE TO ACCESS FIREFOX BROWSER
		WebDriver driver=new FirefoxDriver();
		
		//APPLICATION URL
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		//PRINT STATEMENT
		System.out.println("APPLICATION OPENED");
		
		//TIMEOUT SESSION
		Thread.sleep(3000);
		
		//CLOSE COMMAND MANDATORY
		driver.close();

	}

}
