package app.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.classes.SearchPage;

public class PageObjectModel {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://automationpractice.com/index.php";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		SearchPage.signIn(driver);
		SearchPage.emailAddressCreateAccount(driver);
		SearchPage.submitCreateAccount(driver);
		SearchPage.selectGenderMr(driver);
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
