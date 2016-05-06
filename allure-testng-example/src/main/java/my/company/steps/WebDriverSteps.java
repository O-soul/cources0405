package my.company.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;
import utils.ScreenShots;

public class WebDriverSteps extends BasePage{ // just a page

	@FindBy(id = "text")WebElement inputText;
	@FindBy(className = "suggest2-form__button")WebElement submitButton;
	@FindBy(linkText = "//a[text()='Войти']")WebElement loginLink;
	

	public WebDriverSteps(){
		PageFactory.initElements(driver, this);
	}

	@Step("Oleg, I'm search() method from WebDriverSteps class")   // it will appear in allure report
	public void search(String text) {
		inputText.sendKeys(text);
		ScreenShots.createAttachment(); // I make photo of browser after filling input
		submitButton.submit();
		ScreenShots.createAttachment(); // I make photo of browser after submit
	}
	
	@Step("Oleg, I'm checkURL() method from WebDriverSteps class")
	public boolean checkURL(){
		if(driver.getCurrentUrl() == "https://www.yandex.ua/"){
			return true;
		}
		return false;
	}
	
	@Step("Oleg, I'm clickLoginLink() method from WebDriverSteps class")
	public void clickLoginLink(){
		ScreenShots.createAttachment();
		loginLink.click();
		ScreenShots.createAttachment();
	}

}
