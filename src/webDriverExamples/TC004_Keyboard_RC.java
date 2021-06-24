package webDriverExamples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004_Keyboard_RC {



	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		
		//KEYBOARD ACTION USING JAVA AS REMOTE CONTROL
		//click - keyboard : 1. TAB 2, ENTER
		
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		System.out.println("TAB WORKING");
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("ENTER WORKING");		
		System.out.println("LOGIN SUCCESSFUL");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("LOGOUT COMPLETED");
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
