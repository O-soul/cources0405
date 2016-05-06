package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import my.company.steps.BasePage;
import ru.yandex.qatools.allure.annotations.Attachment;


public class ScreenShots extends BasePage{
	
	// we can use createAttachment() anywhere in solution, so we need to put it in separate class
	
	@Attachment(value = "Page screenshot for Oleg", type = "image/png") // I make screens for any test's conditions 
    public static byte[] createAttachment() {
        return ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.BYTES); 
    }

}
