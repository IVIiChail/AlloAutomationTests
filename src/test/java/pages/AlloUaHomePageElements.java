package pages;

import base.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlloUaHomePageElements extends AbstractBasePage {
    public AlloUaHomePageElements(WebDriver driver) {
        super(driver);
    }

    private static final String DROPDOWN_GUARANTY_RETURN_A = "//div[contains(@class,'dropdown')]//a[contains(@href,'warranty_and_service')]";
    public static final String FOR_CUSTOMERS_DROPDOWN_A = "//a[contains(text(),'Покупцям')]";
    public static final String HEADER_DISCOUNT_BTN ="(//a[@href='https://allo.ua/ua/events-and-discounts/'])[1]";
    public static final String PROMO_LIST_TITLE = "//h1[@class='promo-list__title']";
    public static final String HEADER_BUYERS_BTN ="//a[@class='mh-button mh-button--open']";
    public static final String BUY_PARTLY ="(//a[@href='https://allo.ua/ua/help/oplata-chastami/'])[1]";
    public static final String CONTENT_TITLE_H2="//h2[@class='sp-page-title sp-h2 custom-header']";
    public static final String HEADER_CITY_BTN ="//button[@data-geo-label='Київ']";
    public static final String HEADER_SWITCH_CITY = "//a[@href='https://allo.ua/ua/dnipro']";
    public static final String HEADER_STORES_BTN ="(//a[@href='https://allo.ua/ua/dnipro/offline_stores/'])[1]";
    public static final String LOC_LABEL="//span[@class ='mh-loc__label']";
    public static final String CONTENT_TITLE_H1="//h1[@class ='content__title']";
    public static final String TD_ADDRESS ="//td[@class ='table-body__address']']";
    public static final String DROPDOWN_BLOG_A = "//div[contains(@class,'dropdown')]//a[contains(@href,'blog')]";
    public static final String CONTACT_WITH_US_DROPDOWN_BUTTON = "//div[contains(@class,'mh-phone')]//button[contains(@class,'mh-button')]";
    public static final String DROPDOWN_MESSENGER_A = "//div[contains(@class,'mh-phone')]//a[descendant::span[contains(text(),'Messenger')]]";
    public static final String CITY_CHOOSE_BTN = "//div[contains(@class,'mh-loc')]//button";
    public static final String CITY_FIELD_INPUT = "//input[@id='city']";
    public static final String CITY_AUTOCOMPLETE_DIV = "//div[contains(@class,'modal-input v_autocomplete')]";
    public static final String HEADER_CATALOG_DIV = "//div[contains(@class,'ct-button')]";
    public static final String CATALOG_SMARTPHONES_AND_PHONES_A = "//li//a[contains(@href,'mobilnye-telefony-i-sredstva-svyazi')]";


    public WebElement getGuaranteeReturnBtn(){
        return waitUntilElementToBeClickable(DROPDOWN_GUARANTY_RETURN_A);
    }

    public WebElement getForCustomersDropdownBtn(){
        return waitUntilElementToBeClickable(FOR_CUSTOMERS_DROPDOWN_A);
    }
    public WebElement getDiscount(){
        return waitUntilElementToBeClickable((HEADER_DISCOUNT_BTN));
    }
    public  WebElement getPromoTiltle(){
        return waitUntilVisibilityOfElementLocated(PROMO_LIST_TITLE);
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
    public WebElement getCityButton(){
        return waitUntilElementToBeClickable(HEADER_CITY_BTN);
    }
    public WebElement getDnipro(){
        return waitUntilElementToBeClickable(HEADER_SWITCH_CITY);
    }
    public WebElement getStores(){
        return waitUntilElementToBeClickable(HEADER_STORES_BTN);
    }
    public WebElement getLocLabel(){
        return waitUntilElementToBeClickable(LOC_LABEL);
    }
    public WebElement getContentTitleH1(){
        return waitUntilElementToBeClickable(CONTENT_TITLE_H1);
    }
    public List<WebElement> getTdAddress(){
        return waitUntilElementsToBeClickable(TD_ADDRESS);
    }
    public WebElement getDropDownBlogBtn(){
        return waitUntilElementToBeClickable(DROPDOWN_BLOG_A);
    }
    public WebElement getContactWithUsDropDownBtn(){
        return waitUntilElementToBeClickable(CONTACT_WITH_US_DROPDOWN_BUTTON);
    }
    public WebElement getDropDownMessengerBtn(){
        return waitUntilElementToBeClickable(DROPDOWN_MESSENGER_A);
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
    public WebElement getHeaderCatalogBtn(){
        return waitUntilElementToBeClickable(HEADER_CATALOG_DIV);
    }
    public WebElement getCatalogSmartphonesAndPhonesBtn(){
        return waitUntilElementToBeClickable(CATALOG_SMARTPHONES_AND_PHONES_A);
    }
}

