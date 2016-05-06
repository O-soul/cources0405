package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Settings {
	
	WebDriver driver;
	String baseURL = "http://ya.ru";

	public WebDriver getDriver(BrowserType browserType){		
		switch(browserType){
		case FF:
		driver = new FirefoxDriver();
		case GC:
		driver = new ChromeDriver();
		}	
		return driver;
	}
	
	public String getBaseURL(){
		return baseURL;
	}
	
	
}
