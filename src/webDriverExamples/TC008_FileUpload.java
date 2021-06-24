package webDriverExamples;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC008_FileUpload {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//PATH OF BROWSER
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		//OBJECT CREATE
		WebDriver driver=new ChromeDriver();
		
		//APPLICATION PATH
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		//VERIFY TITLE
		assertEquals("OrangeHRM", driver.getTitle());
		
		//USERNAME AND PASSWORD
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//IMPLICIT WAIT STATEMENT
		WebDriverWait wait=new WebDriverWait(driver,5000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
		driver.findElement(By.name("Submit")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("LOGIN COMPLETED");
		
		//MOUSEOVER 
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("MOUSEOVER COMPLETED");
		Thread.sleep(3000);
		
		//ADD EMPLOYEE
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("CLICK ON SUBMENU");
		Thread.sleep(3000);
		
		//FIRST , MIDDLE,LAST NAME
		driver.findElement(By.name("firstName")).sendKeys("VEDIKA");
		driver.findElement(By.name("middleName")).sendKeys("HRIDAYKUMAR");
		driver.findElement(By.name("lastName")).sendKeys("KAURWAR");
		Thread.sleep(3000);

		
		//UPLOAD FILE
		WebElement fileInput=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[3]/input"));
		fileInput.sendKeys("C:\\Users\\VEDIKA\\Pictures\\Saved Pictures\\BHARAT\\photo07312020.jpg");
		System.out.println("add file successful");
		Thread.sleep(3000);
		
		
		//SAVE BUTTON
		driver.findElement(By.id("btnSave")).click();
		System.out.println("EMPLOYEE ADD SUCCESSFUL");
		Thread.sleep(3000);

		//WELCOME LINK
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		
		//LOGOUT
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout successfully");
		
		driver.close();
		
	}

}
