package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloUaHomePageElements extends AbstractBasePage {
    public AlloUaHomePageElements(WebDriver driver) {
        super(driver);
    }

    private static final String DROPDOWN_GUARANTY_RETURN_A = "//div[contains(@class,'dropdown')]//a[contains(@href,'warranty_and_service')]";

    public static final String FOR_CUSTOMERS_DROPDOWN_A = "//a[contains(text(),'Покупцям')]";

    public static final String CITY_CHOOSE_BTN = "//div[contains(@class,'mh-loc')]//button";

    public static final String CITY_FIELD_INPUT = "//input[@id='city']";

    public static final String CITY_AUTOCOMPLETE_DIV = "//div[contains(@class,'modal-input v_autocomplete')]";

    public WebElement getGuaranteeReturnBtn(){
        return waitUntilElementToBeClickable(DROPDOWN_GUARANTY_RETURN_A);
    }

    public WebElement getForCustomersDropdownBtn(){
        return waitUntilElementToBeClickable(FOR_CUSTOMERS_DROPDOWN_A);
    }

    public WebElement getCityChooseBtn(){
        return waitUntilElementToBeClickable(CITY_CHOOSE_BTN);
    }

    public WebElement getCityInputField(){
        return waitUntilElementToBeClickable(CITY_FIELD_INPUT);
    }

    public WebElement getCityAutocompleteDiv(){
        return waitUntilElementToBeClickable(CITY_AUTOCOMPLETE_DIV);
    }
}
