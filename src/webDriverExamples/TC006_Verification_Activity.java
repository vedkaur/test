package webDriverExamples;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC006_Verification_Activity {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		assertEquals("OrangeHrm", driver.getTitle());
		//driver.findElement(By.xpath(//input[@name='txtUsername'])).sendKeys('admin');
		//driver.findElement(By.xpath(//input[@id='txtPassword'])).sendKeys('admin123');
	    //driver.findElement(By.xpath(//input[@name='Submit'][@class='button'][@id='btnLogin'])).click();

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
