package webDriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC002_PIM {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//URL PATH
		System.setProperty("webdriver.chrome.driver", "F:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		//OBJECT CREATE
		WebDriver driver = new ChromeDriver();
		
		//APPLICATION URL
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("URL SUCCESSFULLY OPEN");
		Thread.sleep(3000);
		
		//VERIFY TITLE
		if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("TITLE MATCHED");
		}
		else
		{
			System.out.println("TITLE NOT MATCHED");
			System.out.println(driver.getTitle());
		}
		
		//ADD USERNAME PASSWORD AND LOGIN
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("LOGIN SUCCESSFUL");
		
		//MOUSEOVER PIM
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b"))).perform();
		System.out.println("MOUSEOVER COMPLETED");
		Thread.sleep(4000);
		
		//ADD EMPLOYEE
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("CLICK ON SUBMENU");
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstName")).sendKeys("VEDIKA");
		driver.findElement(By.name("middleName")).sendKeys("HRIDAYKUMAR");
		driver.findElement(By.name("lastName")).sendKeys("KAURWAR");
		driver.findElement(By.name("employeeId")).sendKeys("0329");
		Thread.sleep(3000);
		
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout successfully");
		
		
		driver.close();
		
		

	}

}
