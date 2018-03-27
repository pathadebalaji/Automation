package com.makemytrip.masterpage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.makemytrip.libraries.LoadTestData;

public class MasterPage {

	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	public LoadTestData ltd;
	public ArrayList<String> dataList;
	
	public MasterPage() throws IOException
	{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\com\\makemytrip\\thirdpartyfiles\\chromedriver.exe");
			driver = new ChromeDriver();
			/*fis = new FileInputStream("F:\\Temp Workspace\\Practice\\PageObjectModel\\src\\com\\makemytrip\\objectrepository\\OR_LoginPage.properties");
			
			prop = new Properties();
			
			prop.load(fis);*/
			
			ltd = new LoadTestData();
					
			dataList = ltd.LoadTestData(); 
						
			driver.get(dataList.get(0));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
	// Method to send input values to identified web element
	public boolean sendKeys(String field)
	{
		driver.findElement(By.xpath(field)).sendKeys(dataList.get(1));
		return true;
	}
	
	// Method to click on button web element
	public boolean click(String field)
	{
		driver.findElement(By.xpath(field)).click();
		return true;
	}
	
	
}
