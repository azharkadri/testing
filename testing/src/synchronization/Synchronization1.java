package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://wwww.facebook.com");
		
		WebElement firstName=driver.findElement(By.name("firstname"));
		WebElement lastName=driver.findElement(By.name("lastname"));
		WebElement email=driver.findElement(By.name("reg_email__"));
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		
		
		sendKeys(driver,10,firstName,"azhar");
		sendKeys(driver,5,lastName,"kadri");
		sendKeys(driver,7,email,"azharkadrigj@gmail.com");
		sendKeys(driver,3,password,"azhar@123");
		
		Thread.sleep(1000);
		WebElement forgottenAccount=driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]"));
		click(driver,10,forgottenAccount);
		
		Thread.sleep(1000);
		driver.close();

	}
	public static void sendKeys(WebDriver driver,long timeout,WebElement element,String value) {
		new WebDriverWait(driver,timeout)
		.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void click(WebDriver driver,long timeout,WebElement element) {
		new WebDriverWait(driver,timeout)
		.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	

}
