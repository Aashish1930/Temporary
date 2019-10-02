package amazon.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import amazon.base.TestBaseAmazon;

public class AmazonHomepage extends TestBaseAmazon {

	SoftAssert soft = new SoftAssert();

	public AmazonHomepage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class=\"nav-search-dropdown searchSelect\"]")
	WebElement dropdown;

	public void VisibleElement() {
		boolean flag = dropdown.isDisplayed();
		soft.assertEquals(flag, true);

	}

	public void checkDropDown() throws InterruptedException {
		Select select = new Select(dropdown);
		int size = select.getOptions().size();
		for (int i = 0; i < size; i++) {
			//System.out.println(select.getOptions().get(i).getText());
			Thread.sleep(5000);
			if (select.getOptions().get(i).getText().equals("Alexa Skills")) {
				select.selectByIndex(i);
			}

		}

	}
	
	public void closed(){
		
	}

}
