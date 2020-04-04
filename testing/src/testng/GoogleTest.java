package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");}
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");}
	
	@Test(priority=1)
	public void googleTitleTest() {
		String eTitle="Google";
		String aTitle=driver.getTitle();
		if(aTitle.equalsIgnoreCase(eTitle))
			System.out.println("title test case passed");
		else
			System.out.println("title test case failed");}
	
	@Test(priority=2)
	public void googleLogoTest() {
		boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
		if(b)
			System.out.println("google logo test passed");
		else
			System.out.println("google logo test failed");}
	
	@Test(priority=3)
	public void searchTest() {
		boolean b=driver.findElement(By.name("q")).isDisplayed();
		if(b)
			System.out.println("search test passed");
		else
			System.out.println("search test failed");}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
