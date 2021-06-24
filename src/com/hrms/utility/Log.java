package com.hrms.utility;

import org.apache.log4j.Logger;

public class Log {
	
	//INITIALIZE LOG4J LOGS
	private static Logger Log=Logger.getLogger(Log.class.getClass().getName());
	//NEED TO CREATE THESE METHODS,SO THAT THEY CAN BE CALLED
	public static void info(String message)
	{
		Log.info(message);
	}
	public static void error(String message)
	{
		Log.error(message);
	}

}
