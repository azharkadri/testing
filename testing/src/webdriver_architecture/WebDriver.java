package webdriver_architecture;

//selenium WebDriver Architecture - Design | concept of interface in WebDriver

public interface WebDriver {
	public void get(String url);
	public void findElement(String locator);
	public void close();
	public void quit();

}
