package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import main.SingletonDriver;
import main.UtilClass;

public class TestPurpous {
	
	UtilClass uc;
	
	
	@Test
	public void testing() {
		
		
		WebDriver driver;

		SingletonDriver sd = SingletonDriver.getThisClassInstence();

		driver = sd.openBrowser("Chrome", "http://automationpractice.com/index.php");
		UtilClass uc = new UtilClass();

		uc.closeAllBrowser();

		//driver.get("https://www.google.com");
	}
@Test
	public void homePageCheck() {
		
		uc.takeScreenShot("HomePage Check");
		assertEquals(uc.getTitle(), "My Store");
	}

}

