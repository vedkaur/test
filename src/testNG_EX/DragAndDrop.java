package testNG_EX;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop
{
	@Test
	public void testDragDrop() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(10000L);
		
		//EXP. TITLE                         //ACTUAL TITLE
		assertEquals("Droppable | jQuery UI",driver.getTitle());
		driver.switchTo().frame(0);
		Actions a=new Actions(driver);
		a.dragAndDrop(driver.findElement(By.id("draggable")), 
				driver.findElement(By.id("droppable"))).perform();
		Thread.sleep(3000);
		driver.close();
				
	}

}
