package main;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

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

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void back() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void goUrl(String url) {
		driver.get(url);	
	}

	public String getText(String locator) {
	return	driver.findElement(By.xpath(locator)).getText();	
	}
	

	public String getAttributes(String locator, String value) {
	return	driver.findElement(By.xpath(locator)).getAttribute(value);	
	}
	
	public void navigateToUrl(String url) {
		driver.navigate().to(url);
	}

	public String getTitle() {
		return driver.getTitle();
	}
	
	public void unvalidateText(String expected , String locator ) {

		String actual =	driver.findElement(By.xpath(locator)).getText();

		if (expected.equals(actual)){
			System.out.println("Test Faild - It matched.");
		}

		else{
			System.out.println(" Test Passed - It didnt match.");
		}
	}

	public void validateAttributes(String expected , String locator, String value ) {

		String actual =	driver.findElement(By.xpath(locator)).getAttribute(value);

		if (expected.equals(actual)){
			System.out.println(" It matched.");
		}

		else{
			System.out.println(" It didnt match.");
		}
	}
	
	public void takeScreenShot(String testName) {
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
//			File localFile = new File(new File("Snapshot"), "Bugs");
//			File screenshot = new File(localFile,testName);
//			Files.copy(source, screenshot);
			
			FileUtils.copyFile(source, new File("C:\\Users\\Owner\\Documents\\ScreenShot\\"+testName+".jpg"));	
		//	FileUtils.copyFile(source, new File("C:\\Users\\Owner\\git\\AutomationPractice\\AutomationPractice1\\screenShot1\\"+testName+".jpg"));
		}
		catch (Exception e){
			System.out.println("Unable to take the screenshot!!");
		}
	}
}