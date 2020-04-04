package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG {
	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite -- setup system property for chrome");}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest -- launch chrome browser");}
	
	@BeforeClass
	public void enterUrl() {
		System.out.println("@BeforeClass -- enter the Url");}
	
	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod -- login to app");}
	
	@Test
	public void googleTitleTest() {
		System.out.println("google title test");}
	
	@Test
	public void googleLogoTest() {
		System.out.println("google logo test");}
	
	@Test
	public void searchTest() {
		System.out.println("search test");}
	
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod -- logout ");}
	
	@AfterClass
	public void deleteAllCookies() {
		System.out.println("@AfterClass -- delete all cookies");}
	
	@AfterTest
	public void quit() {
		System.out.println("@AfterTest -- quit chrome browser");}
	
	@AfterSuite
	public void report() {
		System.out.println("@AfterSuite -- test report generation");}
}
