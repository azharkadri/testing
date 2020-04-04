package softAssertionVsHardAssertion;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoHardAssertion {
	@BeforeMethod
	public void setup() {
		System.out.println("setup method.");
	}
	@Test
	public void testScript1() {
		System.out.println("testScript1 method.");
		Assert.assertEquals(true, false);
		System.out.println("after hard assetion of testScript1 method.");
	}
	@Test
	public void testScript2() {
		System.out.println("testScript1 method.");
		Assert.assertEquals(false, true);
		System.out.println("after hard assetion of testScript2 method.");
	}
	@Test
	public void testScript3() {
		System.out.println("testScript1 method.");
		Assert.assertEquals(true, true);
		System.out.println("after hard assetion of testScript3 method.");
	}
	@Test
	public void testScript4() {
		System.out.println("testScript1 method.");
		Assert.assertEquals(false, false);
		System.out.println("after hard assetion of testScript4 method.");
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("tearDown method.");
	}
}
