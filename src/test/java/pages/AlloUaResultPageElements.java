package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlloUaResultPageElements extends AbstractBasePage {
    public AlloUaResultPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String GUARANTEE_AND_SERVICE_PAGE_TITLE_H4 = "//h4[contains(@class,'page-head')]";
    private static final String HEADER_BLOG_ALLO_LOGO_IMG = "//div[contains(@class,'header_menu')]//img[contains(@alt, 'Блог АЛЛО')]";
    private static final String LIST_OF_PRODUCTS_TITLES_A = "//a[contains(@class,'product-card__title')]";
    private static final String BICYCLES_A = "//li[contains(@class,'portal')]//a[contains(text(),'Велосипеди')]";
    private static final String SMARTPHONES_AND_PHONES_NOKIA_A = "//li[contains(@class,'portal-card')]//a[contains(text(),'Nokia')]";
    private static final String PLAYPENS_A = "//li[contains(@class,'portal')]//a[contains(text(),'Манежі')]";
    private static final String APPSTORE_ALLO_APP_TITLE = "//h1[contains(@class,'product-header__title')]";
    private static final String GET_RESAULT_LINKALLOEXCHANHE = "//div[@class='mh-links']//a[@href='https://allo.ua/ua/tradein/']";
    private static final String INSTAGRAM_ALLO_TITLE_H1 = "//h2";
    private static final String TITLE_ALLO_BOT = "//h1[contains(text(),'ALLO bot')]";

    public WebElement getGuaranteeAndServicePageTitle(){
        return waitUntilElementToBeClickable(GUARANTEE_AND_SERVICE_PAGE_TITLE_H4);
    }
    public WebElement getHeaderBlogAlloLogo(){
        return waitUntilElementToBeClickable(HEADER_BLOG_ALLO_LOGO_IMG);
    }
    public List<WebElement> getGoodsTitles(){
        return waitUntilElementsToBeClickable(LIST_OF_PRODUCTS_TITLES_A);
    }
    public WebElement getBicyclesBtn() {
        return waitUntilElementToBeClickable(BICYCLES_A);
    }
    public WebElement getCatalogSmartphonesAndPhonesNokiaBtn() {
        return waitUntilElementToBeClickable(SMARTPHONES_AND_PHONES_NOKIA_A);
    }
    public WebElement getPlaypensBtn() {
        return waitUntilElementToBeClickable(PLAYPENS_A);
    }
    public WebElement getAppStoreAlloTitle( ) {
        return waitUntilElementToBeClickable(APPSTORE_ALLO_APP_TITLE);
    }
    public WebElement getResault_LinkAlloExchenge() {return waitUntilVisibilityOfElementLocated(GET_RESAULT_LINKALLOEXCHANHE);}
    public WebElement getInstagramTitle() {
        return waitUntilElementToBeClickable(INSTAGRAM_ALLO_TITLE_H1);
    }
    public WebElement getTitleAllo_Bot() {
        return waitUntilVisibilityOfElementLocated(TITLE_ALLO_BOT);
    }
}
