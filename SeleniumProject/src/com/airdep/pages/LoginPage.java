package com.airdep.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginPage {
	@Test
	public void verifyOpenPage(){
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
	}
	@Test
	public void verifyElement() {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("S"));
		driver.quit();
		
		
	}
}
