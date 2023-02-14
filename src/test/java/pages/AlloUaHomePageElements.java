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
    public static final String HEADER_CITY_BTN ="//button[@data-geo-label='Київ']";
    public static final String HEADER_SWITCH_CITY = "//a[@href='https://allo.ua/ua/dnipro']";
    public static final String HEADER_STORES_BTN ="(//a[@href='https://allo.ua/ua/dnipro/offline_stores/'])[1]";
    public static final String LOC_LABEL="//span[@class ='mh-loc__label']";
    public static final String CONTENT_TITLE_H1="//h1[@class ='content__title']";
    public static final String TD_ADDRESS ="//td[@class ='table-body__address']']";

    public WebElement getGuaranteeReturnBtn(){
        return waitUntilElementToBeClickable(DROPDOWN_GUARANTY_RETURN_A);
    }

    public WebElement getForCustomersDropdownBtn(){
        return waitUntilElementToBeClickable(FOR_CUSTOMERS_DROPDOWN_A);
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





}


