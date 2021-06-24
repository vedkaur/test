package com.hrms.TestSripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
@Test
	//public static void main(String[] args) throws Exception

		// TODO Auto-generated method stub
public void tc002() throws Exception
{
	DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.pim();
		obj.addemployee();
		obj.logout();
		obj.closeApplication();

	}

}
