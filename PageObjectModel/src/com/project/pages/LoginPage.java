package com.project.pages;

import java.io.IOException;

import com.project.libraries.LoadProperties;
import com.project.masterpage.MasterPage;

public class LoginPage extends MasterPage {

	public String LoginWBook;
	public String LoginWSheet;
	public static String propertyFileName = "OR_LoginPage.properties";
	public LoadProperties lp;
	
	public LoginPage() throws IOException {
		//Calling constructor of super class
		super();
		lp = new LoadProperties(propertyFileName);
	}

	public void login()
	{
		
		click(lp.prop.getProperty("txt_loginNav"));
		sendKeys(lp.prop.getProperty("txt_username"));
		/*sendKeys(lp.prop.getProperty("txt_password"));
		click(lp.prop.getProperty("button_login"));*/
		
		System.out.println("Username entered");
	}
	
}
