package webdriver_architecture;

public class ChromeDriver implements WebDriver{
	public ChromeDriver() {
		System.out.println("chrome launched");
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
