package webDriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC007_WaitStmt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		WebDriverWait wait=new WebDriverWait(driver,5000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
        driver.findElement(By.name("Submit")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println("LOGIN COMPLETED");
        
        driver.findElement(By.id("welcome")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();
        System.out.println("LOGOUT COMPLETED");
        Thread.sleep(3000);
		
        driver.close();

	}

}
