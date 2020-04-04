package demoHtmlUnitDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class DemoHtmlUnitDriver {

	public static void main(String[] args) {
		WebDriver driver=new HtmlUnitDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource().length());
		
		driver.close();

	}

}
