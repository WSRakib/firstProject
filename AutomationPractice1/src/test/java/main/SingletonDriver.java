package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonDriver {

	private SingletonDriver(WebDriver driver) {
		SingletonDriver.driver = driver;
	}

	protected static WebDriver driver = null;
	private static SingletonDriver driverInstence;
	
	public static SingletonDriver getThisClassInstence() {
		
		if(driverInstence == null)
			driverInstence = new SingletonDriver(driver );
		return driverInstence;
			
	}
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebDriver openBrowser(String browser, String url){

		if(driver == null) {
			if(browser.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else if(browser.equalsIgnoreCase("FireFox")){
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else if(browser.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else {
				System.out.println("Inorrect Driver!");
			}
			
		}
		
		return driver;
	}


}
