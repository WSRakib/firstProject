package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVerify {

	
	@Test
	public void hardassert() {
		System.out.println("Step-1 ");
		assertEquals(true, true);
		System.out.println("Step-2 ");
		assertEquals("Rakib", "Rakib");
		System.out.println("Step-3 ");
		assertEquals(true, false);
		System.out.println("Step-4 ");
		assertEquals(true, true);
	}
	
	@Test
	public void softAssert() {
		SoftAssert sa = new SoftAssert();
		
		System.out.println("Step-1 ");
		sa.assertEquals(true, true);
		System.out.println("Step-2 ");
		sa.assertEquals(1, 2);
		System.out.println("Step-3 ");
		sa.assertEquals(false, true);
		System.out.println("Step-4 ");
		
		sa.assertAll();
		
	}
	
}