package main;

import org.openqa.selenium.WebDriver;

public class UtilClass  {	

//	public UtilClass(WebDriver driver) {
//		super(driver);}
	
	

	SingletonDriver sd = SingletonDriver.getThisClassInstence();
	WebDriver driver = sd.getDriver();
	
	public void closeCurrentBrowser() {
	
		driver.close();
		
	}

	public void closeAllBrowser() {
		
		driver.quit();
	}
	
	
	
}
