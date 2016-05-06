package my.company.steps;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import my.company.steps.BasePage;
import settings.BrowserType;
import settings.Settings;

public class BaseTest {
	
	static Settings settings;
	
	@BeforeSuite(alwaysRun = true)
	public static void beforeSuite() {
		//System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe"); // - I do it in pom file
		settings = new Settings();
		BasePage.driver = settings.getDriver(BrowserType.GC);
		BasePage.driver.get(settings.getBaseURL());
	}
	
	 @AfterSuite(alwaysRun = true)
	    public static void afterClass() {
	        BasePage.driver.close();
	    }
}