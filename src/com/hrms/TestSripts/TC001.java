package com.hrms.TestSripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {
	@Test
	//public static void main(String args[]) throws Exception
	public void tc001() throws Exception
	{
		//TEST CASE STEPS
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}

}
