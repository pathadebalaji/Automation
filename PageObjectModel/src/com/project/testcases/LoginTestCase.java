package com.project.testcases;

import java.io.IOException;

import com.project.pages.LoginPage;

public class LoginTestCase {

	public static String usr_name;
	public static String password;
	
	public static void main(String[] args) throws IOException {
		LoginPage lp=new LoginPage();
		lp.login();
	}

}
