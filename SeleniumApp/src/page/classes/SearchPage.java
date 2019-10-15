package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	public static WebElement element = null;
	
	/**
	 * Navigate to Sing in page
	 * @param driver
	 * @return
	 */
	public static void signIn(WebDriver driver) {
		element = driver.findElement(By.className("login"));
		element.click();
	}
	public static void emailAddressCreateAccount(WebDriver driver) {
		element = driver.findElement(By.id("email_create"));
		element.click();
		element.sendKeys("testseleniumapp@gmail.com");
	}
	public static void submitCreateAccount(WebDriver driver) {
		element = driver.findElement(By.id("SubmitCreate"));
		element.click();
		
	}
	public static void selectGenderMr(WebDriver driver) {
		element = driver.findElement(By.id("id_gender1"));
		element.click();
		
	}

	
	
}
