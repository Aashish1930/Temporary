package amazon.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.ExpectedExceptions;

import amazon.base.TestBaseAmazon;

public class TestUtil extends TestBaseAmazon {

	public static void ExplicitWaitSendKey(WebDriver driver1, WebElement element, int time, String Send) {

		new WebDriverWait(driver1, time).until(ExpectedConditions.visibilityOf(element)).sendKeys(Send);

	}

}
