package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ActionUtil;

public class NDTVWeatherPage extends ActionUtil{

	WebDriver driver;

	By logoWeather = By.id("logo");
	By searchCity = By.id("searchBox");
	By selectCity;
	By tempCelsius;
	By tempFahrenheit;

	public NDTVWeatherPage (WebDriver driver){
		super(driver);
		this.driver = driver;
	}

	public void logoWeather(){

		isElementVisible(logoWeather);
	}

	public void searchAndSelectCity(String city){
		WebElement element = null;
		isElementClickable(searchCity).sendKeys(city);
		if(city != null)
			selectCity = By.id(city);
		element = isElementClickable(selectCity);
		if(!element.isSelected())
			element.click();
	}
	
	public String getTempCelsius(String city){
		String tempCelsiusPath = "//div[@title='" + city + "']/div/span[@class='tempRedText']";
		String celsius = null;
		tempCelsius = By.xpath(tempCelsiusPath);
		celsius = isElementVisible(tempCelsius).getText();
		
		return celsius;
	}
	
	public String getTempFahrenheit(String city){
		String tempFahrenheitPath = "//div[@title='" + city + "']/div/span[@class='tempWhiteText']";
		String fahrenheit = null;
		tempFahrenheit = By.xpath(tempFahrenheitPath);
		fahrenheit = isElementVisible(tempFahrenheit).getText();
		
		return fahrenheit;
	}


}
