package testNG_EX;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WD_TNG_EX {
	
	@AfterClass
	public void close()
	{
		System.out.println("BROWSER CLOSE");
	}
	@BeforeClass
	public void login()
	{
		System.out.println("LOGIN SUCESSFUL");
	}
	@Test(priority=1)
public void add_emp()
{
	System.out.println("add employee completed");

}
	@Test(priority=2)
public void logout()
{
	System.out.println("logout successfully");
}
}
