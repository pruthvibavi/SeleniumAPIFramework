package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ActionUtil;

public class NDTVHomePage extends ActionUtil{

	WebDriver driver;

	By logoNDTV = By.className("ndtvlogo");
	By menuNavigator = By.className("topnavmore");
	By weatherLink = By.xpath("//div[@class='topnav_cont']/a[contains(text(),'WEATHER')]");
	By dismissAlert = By.className("notnow");

	public NDTVHomePage (WebDriver driver){
		super(driver);
		this.driver = driver;
	}

	public void logoNDTV(){

		isElementVisible(logoNDTV);
	}

	public void menuNavigator(){

		isElementClickable(menuNavigator).click();

	}

	public void weatherLink(){

		isElementClickable(weatherLink).click();
	}

	public void handleAlert(){

		isElementClickable(dismissAlert).click();
	}
}
