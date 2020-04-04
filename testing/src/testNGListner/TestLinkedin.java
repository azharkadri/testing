package testNGListner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomizedListener.class)
public class TestLinkedin extends FWUtils{
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.linkedin.com/login");
	}
	@Test
	public void login() {
		System.out.println("login method: 1 test script");
		Assert.fail();
	}
	@Test
	public void login2() {
		System.out.println("login method: 2 test script");
		Assert.assertEquals(true, false);
	}
	@Test
	public void login3() {
		System.out.println("login  method: 3 test script");
		Assert.assertEquals(true, true);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();		
	}
}
