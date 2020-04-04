package webdriver_architecture;

public class GoogleScript {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement("searchbox");
		driver.close();
		driver.quit();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement("searchbox");
		driver.close();
		driver.quit();
			
	}

}
