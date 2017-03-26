package com.learningMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		System.out.println("Logging into account");
		WebDriver driver = new ChromeDriver();

		driver.get("http://twitch.com");
	}
}
