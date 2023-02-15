package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AlloUaHomePageHelper extends AlloUaHomePageElements{
    public AlloUaHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void goToHomePage(){
        driver.get("https://allo.ua/");
    }

    public void chooseSearchedCity(String city){
        getCityChooseBtn().click();
        getCityInputField().sendKeys(city);
        getCityInputField().sendKeys(Keys.ARROW_DOWN);
        getCityInputField().sendKeys(Keys.ENTER);
        getCityAutocompleteDiv().click();
    }

}
