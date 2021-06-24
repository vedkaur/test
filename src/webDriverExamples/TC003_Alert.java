package webDriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC003_Alert {
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Automation Testing\\webdrivers\\geckodriver-v0.29.1-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
        Thread.sleep(3000);
        
        Alert a= driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("LOGIN SUCCESSFUL");
		
		
		
		
		
	}

}
