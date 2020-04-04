package demoTestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTestScript1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.quit();
	}

}
