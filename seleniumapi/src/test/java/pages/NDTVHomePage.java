package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ActionUtil;

class NDTVHomePage extends ActionUtil{

	WebDriver driver;

	By logoNDTV = By.className("ndtvlogo");
	By menuNavigator = By.className("topnavmore");
	By weatherLink = By.xpath("//div[@class='topnav_cont']/a[contains(text(),'WEATHER')]");

	public NDTVHomePage (WebDriver driver){
		super(driver);
		this.driver = driver;
	}

	public void logoNDTV(){

		isElementVisible(logoNDTV);
	}

	public void menuNavigator(){
		
		isElementClickable(menuNavigator).click();;
		
	}

	public void weatherLink(){

		isElementClickable(weatherLink).click();
	}
}
