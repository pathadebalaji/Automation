package com.makemytrip.testcases;

import java.io.IOException;

import com.makemytrip.pages.LoginPage;

public class LoginTestCase {

	public static String usr_name;
	public static String password;
	
	public static void main(String[] args) throws IOException {
		LoginPage lp=new LoginPage();
		lp.login();
	}

}
