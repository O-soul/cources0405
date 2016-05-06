package my.company;

import my.company.steps.BaseTest;
import my.company.steps.OnFailure;
import my.company.steps.WebDriverSteps;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.model.SeverityLevel;
import settings.Settings;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(OnFailure.class)
public class SearchTest extends BaseTest{

    WebDriverSteps steps;
    Settings settings = new Settings();
   
    @BeforeMethod
    public void setUp(){  
    	steps = new WebDriverSteps();
    	settings.getBaseURL();
    }
    
    @Step("Hi, I'm searchYandexTest!")
    @TestCaseId("Oleg-1")
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Oleg, This test case verifies search on yandex page......")
    @Features("Search Feature")
    @Test
    public void searchYandexTest() { 
    	steps.search("some text");
        Assert.assertFalse(steps.checkURL());
    }
    
    @Step("Hi, I'm loginLinkClickTest!")
    @TestCaseId("Oleg-2")
    @Severity(SeverityLevel.MINOR)
    @Description("Oleg, This test case verifies search on yandex page......")
    @Test
    public void loginLinkClickTest() { 
    	steps.search("enimals");
    	steps.clickLoginLink();
    	Assert.assertFalse(true);
    }
}
