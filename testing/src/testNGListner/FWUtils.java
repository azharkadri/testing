package testNGListner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FWUtils {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}
	
	public static WebDriver driver;
	
	public static void takeScreenshot(String failedMethod) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/"+failedMethod+".jpg");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
