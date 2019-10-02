package amazon.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import amazon.base.TestBaseAmazon;
import amazon.pages.AmazonHomepage;

public class home1 extends TestBaseAmazon {
	
	AmazonHomepage home;

	public home1() {
		super();
	}

	@BeforeMethod @Parameters("browser")
	public void setup() {
	//	Initilization("chrome");
		home = new AmazonHomepage();

	}
	
	@Test
	public void CheckVisibility(){
		home.VisibleElement();
		System.out.println("visibility done");
	}
	

}
