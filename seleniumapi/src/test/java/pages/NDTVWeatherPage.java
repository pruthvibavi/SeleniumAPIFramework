package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ActionUtil;

public class NDTVWeatherPage extends ActionUtil{

	WebDriver driver;

	By logoWeather = By.id("Logo");
	By searchCity = By.id("searchBox");
	By selectCity;

	public NDTVWeatherPage (WebDriver driver){
		super(driver);
		this.driver = driver;
	}

	public void logoWeather(){

		isElementVisible(logoWeather);
	}

	public void searchCity(String city){

		isElementClickable(searchCity).sendKeys(city);

	}

	public void selectCity(String city){
		if(city != null)
			selectCity = By.id(city);
		if(!isElementClickable(searchCity).isSelected())
			isElementClickable(searchCity).click();
	
	}

}
