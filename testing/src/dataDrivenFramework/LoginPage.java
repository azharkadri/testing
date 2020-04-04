package dataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement emailOrMobile; 
	@FindBy(name="session_password")
	private WebElement password;
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	private WebElement loginButton;
		
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void enterEmailOrMobile(String emailOrMobile) {
		this.emailOrMobile.sendKeys(emailOrMobile);
	}
	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}
	public void clickOnLoginButton() {
		this.loginButton.click();
	}
}
