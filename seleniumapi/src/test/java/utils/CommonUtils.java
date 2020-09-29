package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUtils {

	WebDriver driver;

	public WebDriver openBrowser(String browserType) {
		switch (browserType) {
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Assert.assertNotNull(driver, "Failed to Initialize Firefox Webdriver");
			break;
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Assert.assertNotNull(driver, "Failed to Initialize Chrome Webdriver");
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			Assert.assertNotNull(driver, "Failed to Initialize IE Webdriver");
			break;
		default:
			//Logging
			WebDriverManager.chromedriver().setup();
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

}
