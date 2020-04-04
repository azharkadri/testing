package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoParametersWithLinkedin {
	
	@Test
	@Parameters({"emailOrMobile","password"})
	public void login(String emailOrMobile,String password) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		WebElement emailOrMobileTextbox=driver.findElement(By.id("username"));
		emailOrMobileTextbox.sendKeys(emailOrMobile);
		
		WebElement passwordTextbox=driver.findElement(By.name("session_password"));
		passwordTextbox.sendKeys(password);
		
		
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
		loginButton.click();
		
	}
	
}
