package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.NDTVWeatherPage;
import pages.NDTVHomePage;
import utils.CommonUtils;

public class VerifyWeatherTestCase {

	WebDriver driver;
	NDTVWeatherPage objNDTVWeatherPage;
	CommonUtils objCommonUtils;
	NDTVHomePage objNDTVHomePage;

	@Test
	public void getTempfromWebsite(){
		String browserType = "chrome";
		String city = "Madurai";
		String temp = null;
		String unit = "Celsius";
		objCommonUtils = new CommonUtils();
		driver = objCommonUtils.openBrowser(browserType);
		driver.get("https://www.ndtv.com/");

		// Navigate to Weather Page
		objNDTVHomePage = new NDTVHomePage(driver);
		objNDTVHomePage.handleAlert();
		objNDTVHomePage.logoNDTV();
		objNDTVHomePage.menuNavigator();
		objNDTVHomePage.weatherLink();

		//Get Temp details from the Weather Map
		objNDTVWeatherPage = new NDTVWeatherPage(driver);
		objNDTVWeatherPage.logoWeather();
		objNDTVWeatherPage.searchAndSelectCity(city);
		if(unit.equalsIgnoreCase(unit)){
			temp = objNDTVWeatherPage.getTempCelsius(city);
		}else{
			temp = objNDTVWeatherPage.getTempFahrenheit(city);
		}

	}


}
