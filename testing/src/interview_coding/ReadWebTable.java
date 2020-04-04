package interview_coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadWebTable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	}
	
	//*[@id="customers"]/tbody/tr[2]/td[1]
	//*[@id="customers"]/tbody/tr[8]/td[1]
	
	@Test
	public void readWebTableOfW3CHTMLTable() {
		String preXpath="//*[@id=\"customers\"]/tbody/tr[";
		String postXpath="]/td[1]";
		
		ArrayList<String> al=new ArrayList<String>();
		
		for(int i=2;i<8;i++) {
			String actualXpath=preXpath+i+postXpath;
			String tableData=driver.findElement(By.xpath(actualXpath)).getText();
			al.add(tableData);
		}
		
		System.out.println("******** before sorting ***********");
		for(String str: al) {
			System.out.println(str);
		}
		
		ArrayList<String> al2=new ArrayList<String>(al);
		Collections.sort(al2);
		System.out.println("******** after sorting ***********");
		for(String str: al2) {
			System.out.println(str);
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
