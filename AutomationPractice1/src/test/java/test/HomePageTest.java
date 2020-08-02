package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import main.SingletonDriver;
import main.UtilClass;

public class HomePageTest {
	UtilClass uc;
	SingletonDriver sd;
	@BeforeMethod
	public void setUp() {
		 sd = SingletonDriver.getThisClassInstence();
			sd.openBrowser("Chrome", "http://automationpractice.com/index.php");
			
			uc = new UtilClass();
	}
	
//	@AfterMethod
//	public void tearDown() {
//		uc.closeCurrentBrowser();
//	}
	
	

	@Test
	public void homePageCheck() {
		uc.takeScreenShot("SecondShot");
		assertEquals(uc.getTitle(), "My Store");
		
	}
	
	
//	@Test
//	public void contactUsText() {
//		assertEquals(uc.getText("//a[@title='Contact Us']"), "Contact Us");
//	}
}
