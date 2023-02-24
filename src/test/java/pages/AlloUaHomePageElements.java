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
    private static final String PLAYMARKET_ICN ="//a[@class='footer-apps__link footer-apps__link--playmarket']";
    private static final String FACEBOOK_ICN ="//a[@href='https://www.facebook.com/allo']";
    private static final String ALLO_USERNAME ="(//h2[@class='x1heor9g x1qlqyl8 x1pd3egz x1a2a7pz x193iq5w xeuugli'])[1]";
    private static final String OFFICIAL_REPSENT ="//h3[contains(text(),'Офіційні представники')]";
    private static final String ADDITIONAL_SECTION ="(//ul[@class='additional-section__list'])[2]";
    private static final String AUDIO_ICON ="(//a[@href='https://allo.ua/ua/naushniki-i-akustika/'])[1]";
    private static final String WIRELESS_BTN ="(//a[@href='https://allo.ua/ua/naushniki/tip_podkljuchenija_naushniki-besprovodnoe/'])[2]";
    private static final String PRODUCT_CARD ="//a[@class='product-card__title']";
    private static final String SEARCH_FIELD ="//input[@id='search-form__input']";
    private static final String SEARCH_BTN ="//button[@class='search-form__submit-button']";
    private static final String CATALOG_EMPTY ="//p[@class='v-catalog__empty']";
    private static final String TIKTOK_ICN ="//a[@aria-label='tiktok']";
    private static final String TT_ALLOUSER ="//h2[@class='tiktok-t89rw6-H2ShareTitle ekmpd5l5']";
    private static final String LINK_ALLO_MONEY = "//div[@class='mh-links']//a[@href='https://allo.ua/ua/loyalty-program/']";
    private static final String SEARCH_FIELD_HOME_PAGE_ALLO = "//input[@id='search-form__input']";
    private static final String BTN_SEARCH_ON_HOME_PAGE_ALLO = "//button[@type='submit']";
    private static final String RESALTS_SEARCH_ELEMENTS_SAMSUNG = "//a[@class='product-card__title']";
    private static final String FOOTER_INSTAGRAM_A = "//a[contains(@href,'instagram')]";
    private static final String LOGIN_EMAIL_INPUT = "//input[contains(@id,'auth')]";
    private static final String LOGIN_PASSWORD_INPUT = "//input[contains(@id,'login-password')]";
    private static final String LOGIN_SUBMIT_BTN = "//button[contains(@class,'modal-submit-button')]";
    private static final String LOGIN_ERROR_SPAN = "//div[contains(@class,'validation-error')]//span";
    private static final String FIRST_ELEMENT_TOP_SALES_BUY_BTN ="(//div[contains(@class,'buy-box')]//button)[1]";
    private static final String LIST_CART_PRODUCT_ITEM_LI ="//div[contains(@class,'products__container')]//li[contains(@class,'list_item')]";
    private static final String FIRST_ELEMENT_CART_DELETE_SVG ="//*[local-name() = 'svg'][contains(@class,'close remove')][1]";
    private static final String CART_IS_EMPTY_P ="//div[contains(@class,'popup_empty')]//p[1]";
    private static final String COMMUNICATION_BTN_DIV ="//div[contains(@class,'contacts-widget__button')]";
    private static final String COMMUNICATION_VIBER_BTN_DIV ="//a[contains(@class,'contacts')][contains(@href,'viber')]";
    private static final String COMMUNICATION_TELEGRAM_BTN_DIV ="//a[contains(@class,'contacts')][contains(@href,'allohelp')]";
    private static final String COMMUNICATION_MESSENGER_BTN_DIV ="//a[contains(@class,'contacts')][contains(@href,'m.me/allo')]";
    private static final String COMMUNICATION_PHONE_BTN_DIV ="//a[contains(@class,'contacts')][contains(@href,'tel')]";
    private static final String LINK_DELIVERY_AND_PAYMENT = "//div[@class='mh-button__dropdown']//a[contains(@href,'shipment_payment')]";
    private static final String HEADER_TITLE_DEL_AND_PAYM = "//h2[@class='sp-page-title sp-h2 page-header']";
    private static final String CONTACT_US_BTN = "//span[@class='mh-phone__title']";
    private static final String LINK_VIBER_BTN = "//div[@class='contacts active']//a[@aria-label='Viber']";
    private static final String LINK_ALLO_TELEGRAM = "//a[@href='https://t.me/allonews']";

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

    public WebElement getContact_Us() {
        return waitUntilElementToBeClickable(CONTACT_US_BTN);
    }

    public WebElement getLinkViberBtn() {
        return waitUntilElementToBeClickable(LINK_VIBER_BTN);
    }

    public WebElement getLink_Delivery_and_Paymant() {
        return waitUntilElementToBeClickable(LINK_DELIVERY_AND_PAYMENT);
    }

    public WebElement getHeader_Title_Del_and_Paym() {
        return waitUntilVisibilityOfElementLocated(HEADER_TITLE_DEL_AND_PAYM);
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
    public WebElement getSearchFieldHomePageAllo() {
        return waitUntilElementToBeClickable(SEARCH_FIELD_HOME_PAGE_ALLO);
    }
    public WebElement getBtnSearchFieldHomePageAllo() {
        return waitUntilVisibilityOfElementLocated(BTN_SEARCH_ON_HOME_PAGE_ALLO);
    }
    public List<WebElement> getResaltsSearchElementsSamsung() {
        return waitUntilElementsToBeClickable(RESALTS_SEARCH_ELEMENTS_SAMSUNG);
    }
    public WebElement getCommunicationBtn(){
        return waitUntilElementToBeClickable(COMMUNICATION_BTN_DIV);
    }
    public WebElement getCommunicationViberBtn() {
        return waitUntilElementToBeClickable(COMMUNICATION_VIBER_BTN_DIV);
    }
    public WebElement getOfficailRepresent(){
        return waitUntilVisibilityOfElementLocated(OFFICIAL_REPSENT);
    }
    public WebElement getRepresentations(){
        return waitUntilVisibilityOfElementLocated(ADDITIONAL_SECTION);
    }
    public WebElement moveAudio(){
        return waitUntilVisibilityOfElementLocated(AUDIO_ICON);
    }
    public AlloUaHomePageElements moveOnCategoryAudio(){
        moveCursor(moveAudio());
        return this;
    }
    public WebElement getWireless(){
        return waitUntilElementToBeClickable(WIRELESS_BTN);
    }
    public WebElement productWireless(){
        return waitUntilVisibilityOfElementLocated(PRODUCT_CARD);
    }
    public WebElement getSearchField(){
        return waitUntilElementToBeClickable(SEARCH_FIELD);
    }
    public WebElement getSearchBtn(){
        return waitUntilElementToBeClickable(SEARCH_BTN);
    }
    public WebElement getCatalogEmpty(){
        return waitUntilVisibilityOfElementLocated(CATALOG_EMPTY);
    }
    public WebElement getTikTok(){
        return waitUntilElementToBeClickable(TIKTOK_ICN);
    }
    public void goToTikTok(){
        driver.get("https://www.tiktok.com/@allo.official");
    }
    public WebElement getTTUserAllo(){
        return waitUntilVisibilityOfElementLocated(TT_ALLOUSER);
    }
    public WebElement getFooterInstagramBtn(){
        return waitUntilElementToBeClickable(FOOTER_INSTAGRAM_A);
    }
    public WebElement getDownloadPlMa(){
        return waitUntilElementToBePresence(PLAYMARKET_ICN);
    }
    public WebElement getLoginEmailInput(){
        return waitUntilElementToBeClickable(LOGIN_EMAIL_INPUT);
    }
    public WebElement getLoginPasswordInput(){
        return waitUntilElementToBeClickable(LOGIN_PASSWORD_INPUT);
    }
    public WebElement getLoginSubmitBtn(){
        return waitUntilElementToBeClickable(LOGIN_SUBMIT_BTN);
    }
    public WebElement getLoginErrorSpan(){
        return waitUntilElementToBeClickable(LOGIN_ERROR_SPAN);
    }
    public List<WebElement> getCartListOfItems(){
        return waitUntilElementsToBeClickable(LIST_CART_PRODUCT_ITEM_LI);
    }
    public WebElement getFirstElementTopSalesBuyBtn(){
        return waitUntilElementToBeClickable(FIRST_ELEMENT_TOP_SALES_BUY_BTN);
    }
    public WebElement getCommunicationTelegramBtn(){
        return waitUntilElementToBeClickable(COMMUNICATION_TELEGRAM_BTN_DIV);
    }
    public WebElement getCommunicationMessengerBtn(){
        return waitUntilElementToBeClickable(COMMUNICATION_MESSENGER_BTN_DIV);
    }
    public WebElement getCommunicationPhoneBtn(){
        return waitUntilElementToBeClickable(COMMUNICATION_PHONE_BTN_DIV);
    }


    public WebElement getLinkAlloTelegram() {
        return waitUntilElementToBeClickable(LINK_ALLO_TELEGRAM);
    }
}


