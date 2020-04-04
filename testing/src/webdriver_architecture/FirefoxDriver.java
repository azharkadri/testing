package webdriver_architecture;

public class FirefoxDriver implements WebDriver{
	public FirefoxDriver() {
		System.out.println("firefox launched");
	}
	public void get(String url) {
		System.out.println("web page opened");
	}
	public void findElement(String locator) {
		System.out.println("element has been found");
	}
	public void close() {
		System.out.println("browsers closed");
	}
	public void quit() {
		System.out.println("browser closed");
	}

}
