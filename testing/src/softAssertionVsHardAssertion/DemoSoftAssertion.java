package softAssertionVsHardAssertion;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssertion {
	@BeforeMethod
	public void setup() {
		System.out.println("setup method.");}
	@Test
	public void testScript1() {
		SoftAssert sa=new SoftAssert();
		System.out.println("testScript1 method.");
		sa.assertEquals(true, false);
		System.out.println("after hard assetion of testScript1 method.");
		sa.assertAll();}
	@Test
	public void testScript2() {
		SoftAssert sa=new SoftAssert();
		System.out.println("testScript1 method.");
		sa.assertEquals(false, true);
		System.out.println("after hard assetion of testScript2 method.");
		sa.assertAll();}
	@Test
	public void testScript3() {
		SoftAssert sa=new SoftAssert();
		System.out.println("testScript1 method.");
		sa.assertEquals(true, true);
		System.out.println("after hard assetion of testScript3 method.");
		sa.assertAll();}
	@Test
	public void testScript4() {
		SoftAssert sa=new SoftAssert();
		System.out.println("testScript1 method.");
		sa.assertEquals(false, false);
		System.out.println("after hard assetion of testScript4 method.");
		sa.assertAll();}
	@AfterMethod
	public void tearDown() {
		System.out.println("tearDown method.");}
}
