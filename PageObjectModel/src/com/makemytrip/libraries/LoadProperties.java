package com.makemytrip.libraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class LoadProperties {

	public Properties prop;
	
	public LoadProperties(String propertyFileName)
	{
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\com\\makemytrip\\objectrepository\\"+ propertyFileName);
			
			prop = new Properties();
			
			prop.load(fis);
						
		} catch (IOException e) {
			System.out.println("Login Page property file not found");
			e.printStackTrace();
		}
	}
	
	
}
