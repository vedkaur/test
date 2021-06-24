package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation Testing\\webdrivers\\geckodriver-v0.29.1-win64\\firefoxdriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("APPLICATION OPENED");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		System.out.println("successfully login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout successfully");
		
		
		driver.close();

	}

}
