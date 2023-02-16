package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlloUaHomePageElements extends AbstractBasePage {
    public AlloUaHomePageElements(WebDriver driver) {
        super(driver);
    }

    private static final String DROPDOWN_GUARANTY_RETURN_A = "//div[contains(@class,'dropdown')]//a[contains(@href,'warranty_and_service')]";
    private static final String FOR_CUSTOMERS_DROPDOWN_A = "//a[contains(text(),'Покупцям')]";
    private static final String HEADER_MIDDLE_DISCOUNT = "(//a[@href='https://allo.ua/ua/events-and-discounts/'])[1]";
    private static final String LOGO_BTN ="(//img[@alt='Интернет-Магазин Allo'])[1]";
    private static final String HEADER_DISCOUNT_BTN ="(//a[@href='https://allo.ua/ua/events-and-discounts/'])[1]";
    private static final String PROMO_LIST_TITLE = "//h1[@class='promo-list__title']";
    private static final String HEADER_BUYERS_BTN ="//a[@class='mh-button mh-button--open']";
    private static final String BUY_PARTLY ="(//a[@href='https://allo.ua/ua/help/oplata-chastami/'])[1]";
    private static final String CONTENT_TITLE_H2="//h2[@class='sp-page-title sp-h2 custom-header']";
    private static final String HEADER_CITY_BTN ="//button[@data-geo-label='Київ']";
    private static final String HEADER_SWITCH_CITY = "//a[@href='https://allo.ua/ua/dnipro']";
    private static final String HEADER_STORES_BTN ="(//a[@href='https://allo.ua/ua/dnipro/offline_stores/'])[1]";
    private static final String LOC_LABEL="//span[@class ='mh-loc__label']";
    private static final String CONTENT_TITLE_H1="//h1[@class ='content__title']";
    private static final String TD_ADDRESS ="//td[@class ='table-body__address']";
    private static final String DROPDOWN_BLOG_A = "//div[contains(@class,'dropdown')]//a[contains(@href,'blog')]";
    private static final String CONTACT_WITH_US_DROPDOWN_BUTTON = "//div[contains(@class,'mh-phone')]//button[contains(@class,'mh-button')]";
    private static final String DROPDOWN_MESSENGER_A = "//div[contains(@class,'mh-phone')]//a[descendant::span[contains(text(),'Messenger')]]";
    private static final String CITY_CHOOSE_BTN = "//div[contains(@class,'mh-loc')]//button";
    private static final String CITY_FIELD_INPUT = "//input[@id='city']";
    private static final String CITY_AUTOCOMPLETE_DIV = "//div[contains(@class,'modal-input v_autocomplete')]";
    private static final String CATALOG_HEALTH_AND_SPORT_A = "//li//a[contains(@href,'https://allo.ua/ua/sport-i-zdorov-e/')]";
    private static final String CATALOG_GOODS_FOR_CHILDREN_A = "//li[contains(@class,'mm__item')]/a[contains(@href,'tovary-dlja-detej')]";
    private static final String HEADER_CATALOG_DIV = "//div[contains(@class,'ct-button')]";
    private static final String CATALOG_SMARTPHONES_AND_PHONES_A = "//li//a[contains(@href,'mobilnye-telefony-i-sredstva-svyazi')]";
    private static final String HEADER_CONTACTS_US = "//span[@class='mh-phone__title']";
    private static final String TELEGRAM_BTN = "(//span[@class='contacts__label'])[2]";
    private static final String ALLO_HELP_BOT ="//div[contains(text(),'@allohelp_bot')]";
    private static final String CATALOG_BTN = "//div[@class='mh-catalog-btn']";
    private static final String HOUSEHOLD_APP_BTN = "//a[@href='https://allo.ua/ua/bytovaya-tehnika/']";
    private static final String REFRIGERATORS_BTN ="(//a[@href='https://allo.ua/ua/holodilniki/'])[1]";
    private static final String PRODUCT_CONTENT ="//div[@class= 'product-card__content']";
    private static final String DOWNLOAD_WITH_APPSTORE_A = "//a[contains(@class,'appstore')]";
    private static final String REGISTRATION_EMAIL_INPUT = "//input[contains(@id,'register-email')]";
    private static final String REGISTRATION_PASSWORD_INPUT = "//input[contains(@id,'vregister-password')]";
    private static final String REGISTRATION_SUBMIT_BTN = "//button[contains(@class,'modal-submit-button')]";
    private static final String REGISTRATION_ERROR_EMAIL_SPAN = "//div[child::label[contains(text(),'пошта')]]//span";
    private static final String REGISTRATION_ERROR_PHONE_SPAN = "//div[child::label[contains(text(),'Телефон')]]//span";
    private static final String PROFILE_BTN = "//div[contains(@class,'profile')]//button[contains(@class,'mh-button')]";
    private static final String REGISTRATION_BTN = "//li[contains(text(),'Реєстрація')]";
    private static final String LINK_ALLO_EXCHENGE = "//a[@href='https://allo.ua/ua/tradein/']";
    private static final String FACEBOOK_ICN ="//a[@href='https://www.facebook.com/allo']";
    private static final String ALLO_USERNAME ="(//h2[@class='x1heor9g x1qlqyl8 x1pd3egz x1a2a7pz x193iq5w xeuugli'])[1]";
    private static final String LINK_ALLO_MONEY = "//div[@class='mh-links']//a[@href='https://allo.ua/ua/loyalty-program/']";
    private static final String LINK_SITE_CONDITIONS = "//a[@href='https://allo.ua/ua/terms_of_use/']";
    private static final String HEADER_NAME_SITE_CONDITIONS = "//h1[@class='sp-title-h1 page-gotham-header header-custom-marketplace']";

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
    public WebElement getSportAndHealthBtn(){
        return waitUntilElementToBeClickable(CATALOG_HEALTH_AND_SPORT_A);
    }
    public WebElement getHeaderCatalogBtn(){
        return waitUntilElementToBeClickable(HEADER_CATALOG_DIV);
    }
    public WebElement getCatalogSmartphonesAndPhonesBtn(){
        return waitUntilElementToBeClickable(CATALOG_SMARTPHONES_AND_PHONES_A);
    }
    public WebElement getGoodsForChildren(){
        return waitUntilElementToBeClickable(CATALOG_GOODS_FOR_CHILDREN_A);
    }
    public WebElement getDiscountMiddle(){
        return waitUntilElementToBeClickable(HEADER_MIDDLE_DISCOUNT);
    }
    public WebElement returnToHomePageByLogo(){
        return waitUntilElementToBeClickable(LOGO_BTN);
    }
    public WebElement getCatalog(){
        return waitUntilElementToBeClickable(CATALOG_BTN);
    }
    public WebElement moveHouseholdApp(){
        return waitUntilElementToBeClickable(HOUSEHOLD_APP_BTN);
    }
    public WebElement getRefrigerators(){
        return waitUntilElementToBeClickable(REFRIGERATORS_BTN);
    }
    public WebElement getProductRefrigerators(){
        return waitUntilVisibilityOfElementLocated(PRODUCT_CONTENT);
    }
    public AlloUaHomePageElements moveOnCategoryHousehold(){
        moveCursor(moveHouseholdApp());
        return this;
    }
    public WebElement getContactsUs(){
        return waitUntilElementToBeClickable(HEADER_CONTACTS_US);
    }
    public WebElement getTelegram(){
        return waitUntilElementToBeClickable(TELEGRAM_BTN);
    }
    public WebElement getAlloHelpBot(){
        return waitUntilVisibilityOfElementLocated(ALLO_HELP_BOT);
    }
    public void GoToTelegram(){
        driver.get("https://t.me/allohelp_bot");
    }
    public WebElement getDownloadWithAppStoreBtn(){
        return waitUntilElementToBeClickable(DOWNLOAD_WITH_APPSTORE_A);
    }
    public WebElement getLinkAlloMoney() {
        return waitUntilElementToBeClickable(LINK_ALLO_MONEY);
    }
    public WebElement getProfileBtn(){
        return waitUntilElementToBeClickable(PROFILE_BTN);
    }
    public WebElement getRegistrationEmailInput(){
        return waitUntilElementToBeClickable(REGISTRATION_EMAIL_INPUT);
    }
    public WebElement getRegistrationBtn(){
        return waitUntilElementToBeClickable(REGISTRATION_BTN);
    }
    public WebElement getRegistrationPasswordInput(){
        return waitUntilElementToBeClickable(REGISTRATION_PASSWORD_INPUT);
    }
    public WebElement getRegistrationSubmitBtn(){
        return waitUntilElementToBeClickable(REGISTRATION_SUBMIT_BTN);
    }
    public WebElement getRegistrationPhoneErrorSpan(){
        return waitUntilElementToBeClickable(REGISTRATION_ERROR_PHONE_SPAN);
    }
    public WebElement getRegistrationEmailErrorSpan(){
        return waitUntilElementToBeClickable(REGISTRATION_ERROR_EMAIL_SPAN);
    }
    public WebElement getLinkAlloExchange() {
        return waitUntilVisibilityOfElementLocated(LINK_ALLO_EXCHENGE);
    }
    public WebElement getFacebook(){
        return waitUntilElementToBeClickable(FACEBOOK_ICN);
    }
    public WebElement getUserNameAllo(){
        return waitUntilVisibilityOfElementLocated(ALLO_USERNAME);
    }
    public void goToFacebook(){
        driver.get("https://www.facebook.com/allo");
    }
    public WebElement getLinkSiteConditions() {
        return waitUntilVisibilityOfElementLocated(LINK_SITE_CONDITIONS);
    }
    public WebElement getHeaderNameSiteCondotions() {
        return waitUntilVisibilityOfElementLocated(HEADER_NAME_SITE_CONDITIONS);
    }
}


