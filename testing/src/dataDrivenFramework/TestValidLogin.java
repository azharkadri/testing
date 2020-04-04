package dataDrivenFramework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestValidLogin extends FWUtils{
	static{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(PTO, TimeUnit.SECONDS);
		driver.get(URL);
		
		int row=1,cell=0;
		String emailOrMobile=null;
		emailOrMobile=FWUtils.readExcelData(EXCEL_PATH_WORKBOOK,EXCEL_SHEET,row,cell);
		System.out.println("emailOrMobile :"+emailOrMobile);
		row++;	cell++;
		String password=null;
		password=FWUtils.readExcelData(EXCEL_PATH_WORKBOOK,EXCEL_SHEET,row,cell);
		System.out.println("password :"+password);
		
		LoginPage lp=new LoginPage(driver);
		lp.enterEmailOrMobile(emailOrMobile);
		lp.enterPassword(password);
		lp.clickOnLoginButton();
		
		//driver.close();
	}
}
