package utils;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionUtil {

	WebDriver driver;

	public ActionUtil (WebDriver driver){
		this.driver = driver;
	}

	public WebElement isElementVisible(By inelement){

		WebElement element = null;

		try{

			element = new WebDriverWait(driver, 60)
					.until(ExpectedConditions.visibilityOfElementLocated(inelement));

		}catch(Exception e){
			// Logging
		}

		Assert.assertNotNull("Element is not visible " + inelement , element);
		return element;
	}
	
	public WebElement isElementClickable(By inelement){

		WebElement element = null;

		try{

			element = new WebDriverWait(driver, 60)
					.until(ExpectedConditions.elementToBeClickable(inelement));

		}catch(Exception e){
			// Logging
		}

		Assert.assertNotNull("Element is not clickable " + inelement , element);
		return element;
	}

	public WebElement isElementVisible(WebElement inelement){

		WebElement element = null;

		try{

			element = new WebDriverWait(driver, 60)
					.until(ExpectedConditions.visibilityOf(inelement));

		}catch(Exception e){
			// Logging
		}

		Assert.assertNotNull("Element is not visible " + inelement , element);
		return element;
	}
	
	public WebElement isElementClickable(WebElement inelement){

		WebElement element = null;

		try{

			element = new WebDriverWait(driver, 60)
					.until(ExpectedConditions.elementToBeClickable(inelement));

		}catch(Exception e){
			// Logging
		}

		Assert.assertNotNull("Element is not clickable " + inelement , element);
		return element;
	}
	
}
