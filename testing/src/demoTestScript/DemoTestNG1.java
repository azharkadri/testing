package demoTestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG1 {
	
	@Test
	public void testCase1() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void testCase2() {
		Assert.assertEquals(true, true);
	}
	@Test
	public void testCase3() {
		Assert.assertEquals(false, false);
	}
	
}
