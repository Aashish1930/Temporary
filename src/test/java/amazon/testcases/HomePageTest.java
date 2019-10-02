package amazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import amazon.base.TestBaseAmazon;
import amazon.pages.AmazonHomepage;

public class HomePageTest extends TestBaseAmazon {

	AmazonHomepage home;

	public HomePageTest() {
		super();
	}

	@BeforeMethod 
	public void setup() {
		Initilization();
		home = new AmazonHomepage();

	}

	@Test
	public void CheckVisibility(){
		home.VisibleElement();
	}
	

	@Test
	public void StartTest() throws InterruptedException {
		home.checkDropDown();
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
