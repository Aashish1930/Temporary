package amazon.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class TestBaseAmazon {

	public static Properties prop;
	public static WebDriver driver;
	public static SoftAssert soft ;
	
	
	public TestBaseAmazon() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream(
					"E:\\code\\AmazonPOM\\src\\main\\java\\amazon\\config\\AmazonConfig.properties");
			prop.load(file);
			System.out.println("configuration file is load ");
		} catch (Exception e) {

		}

	}

/*	@BeforeMethod
	@Parameters("browser")*/
	
	
	public static void Initilization() {
		
		String browserName = prop.getProperty("browser");
		

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\ChromeUpdate-76\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","E:\\selenium\\firefox update driver\\geckodriver-v0.24.0-win64(1)\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	

}
