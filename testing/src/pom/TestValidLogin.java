package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestValidLogin implements IAutoConstant{
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(PLTO, TimeUnit.SECONDS);
		
		
		driver.get(URL);
		
		LoginPage lp=new LoginPage(driver);
		lp.enterEmailOrPhoneNo("azharkadrigj@gmail.com");
		lp.enterPassword("NAWADA@1992");
		lp.clickOnSigninButton();
				

		//driver.close();
		
	}
}
