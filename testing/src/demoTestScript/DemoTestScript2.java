package demoTestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTestScript2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String atitle=driver.getTitle();
		if(atitle.equals("Google"))
			System.out.println("title is correct.");
		else
			System.out.println("title is incorrect.");
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.close();
	}

}
