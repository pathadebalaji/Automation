package com.makemytrip.pages;

import java.io.IOException;

import com.makemytrip.libraries.LoadProperties;
import com.makemytrip.masterpage.MasterPage;

public class LoginPage extends MasterPage {

	public String LoginWBook;
	public String LoginWSheet;
	public static String propertyFileName = "OR_LoginPage.properties";
	public LoadProperties lp;
	
	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		lp = new LoadProperties(propertyFileName);
	}

	public void login()
	{
		
		click(lp.prop.getProperty("txt_loginNav"));
		sendKeys(lp.prop.getProperty("txt_username"));
		/*sendKeys(lp.prop.getProperty("txt_password"));
		click(lp.prop.getProperty("button_login"));*/
	}
	
}
