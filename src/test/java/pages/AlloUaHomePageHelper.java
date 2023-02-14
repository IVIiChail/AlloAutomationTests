package pages;

import org.openqa.selenium.WebDriver;

public class AlloUaHomePageHelper extends AlloUaHomePageElements{
    public AlloUaHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void goToHomePage(){
        driver.get("https://allo.ua/");
    }

}
