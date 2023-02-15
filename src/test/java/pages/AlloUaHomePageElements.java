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
    public static final String HEADER_BUYERS_BTN ="//a[@class='mh-button mh-button--open']";
    public static final String BUY_PARTLY ="(//a[@href='https://allo.ua/ua/help/oplata-chastami/'])[1]";
    public static final String CONTENT_TITLE_H2="//h2[@class='sp-page-title sp-h2 custom-header']";

    public WebElement getGuaranteeReturnBtn(){
        return waitUntilElementToBeClickable(DROPDOWN_GUARANTY_RETURN_A);
    }

    public WebElement getForCustomersDropdownBtn(){
        return waitUntilElementToBeClickable(FOR_CUSTOMERS_DROPDOWN_A);
    }
    public WebElement getBuyers(){
        return waitUntilElementToBeClickable(HEADER_BUYERS_BTN);
    }
    public WebElement getBuyPartly(){
        return waitUntilElementToBeClickable(BUY_PARTLY);
    }
    public WebElement getContentTitleH2(){
        return waitUntilElementToBeClickable(CONTENT_TITLE_H2);
    }

}
