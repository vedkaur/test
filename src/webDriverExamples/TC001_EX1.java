package webDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC001_EX1 {
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\WEBDRIVER\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.close();
		
	}

}
