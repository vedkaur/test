package webDriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC005_DROPDOWN {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("LOGIN SUCCESSFUL");
		Thread.sleep(3000);
		
		//MOUSEOVER PIM
				Actions ac= new Actions(driver);
				ac.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b"))).perform();
				System.out.println("MOUSEOVER COMPLETED");
				Thread.sleep(4000);
				
				//ADD EMPLOYEE
				driver.findElement(By.linkText("Employee List")).click();
				System.out.println("CLICK ON SUBMENU");
				Thread.sleep(3000);
				
				//ADD EMPID AND NAME
				driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("Sara");
				driver.findElement(By.xpath("//*[@id=\"empsearch_id\"]")).sendKeys("0103");
				Thread.sleep(3000);
                System.out.println("ENTER EMPID AND NAME ");
                
                //DROPDOWN LIST
				Select st=new Select(driver.findElement(By.xpath("//*[@id=\"empsearch_employee_status\"]")));
				st.selectByVisibleText("Full-Time Permanent");
				Thread.sleep(3000);
                System.out.println("DROPDOWN COMPLETED");


				driver.findElement(By.id("searchBtn")).click();
				Thread.sleep(3000);
                System.out.println("SEARCH COMPLETED");


				//click on Checkbox
				driver.findElement(By.name("chkSelectRow[]")).click();
				Thread.sleep(3000);
                System.out.println("CHECKBOX CLICK COMPLETED");


				//DELETE EMPLOYEE
				driver.findElement(By.id("btnDelete")).click();
				
				//ALERT OF OK DELETE
				Alert a=driver.switchTo().alert();
				System.out.println(a.getText());
				a.accept();
                System.out.println("DELETE EMPLOYEE SUCCESSFUL");


				//LOGOUT
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Logout")).click();
				Thread.sleep(3000);
				System.out.println("Logout successfully");
				

	}

}
