package com.tdd.hybrid;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LinkedinLoginTest extends FWUtils{
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	
	WebDriver driver=null;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(PLTO, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@DataProvider
	public Iterator<Object[]> getDataMethod() throws EncryptedDocumentException, FileNotFoundException, IOException{
		ArrayList<Object[]> data=FWUtils.getData();
		return data.iterator();
		
	}
	
	@Test(dataProvider="getDataMethod")
	public void linkedLoginTest(String emailOrMobile, String password){
		LinkedinLoginPage llp=new LinkedinLoginPage(driver);
		llp.enterEmailOrMobile(emailOrMobile);
		llp.enterPassword(password);
		llp.clickOnSigninButton();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
