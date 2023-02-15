package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlloUaResultPageElements extends AbstractBasePage {
    public AlloUaResultPageElements(WebDriver driver) {
        super(driver);
    }

    public static final String GUARANTEE_AND_SERVICE_PAGE_TITLE_H4 = "//h4[contains(@class,'page-head')]";
    public static final String HEADER_BLOG_ALLO_LOGO_IMG = "//div[contains(@class,'header_menu')]//img[contains(@alt, 'Блог АЛЛО')]";
    public static final String LIST_OF_PRODUCTS_TITLES_A = "//a[contains(@class,'product-card__title')]";
    public static final String SMARTPHONES_AND_PHONES_NOKIA_A = "//li[contains(@class,'portal-card')]//a[contains(text(),'Nokia')]";
    public static final String PLAYPENS_A = "//li[contains(@class,'portal')]//a[contains(text(),'Манежі')]";
    public WebElement getGuaranteeAndServicePageTitle(){
        return waitUntilElementToBeClickable(GUARANTEE_AND_SERVICE_PAGE_TITLE_H4);
    }
    public WebElement getHeaderBlogAlloLogo(){
        return waitUntilElementToBeClickable(HEADER_BLOG_ALLO_LOGO_IMG);
    }

    public List<WebElement> getGoodsTitles(){
        return waitUntilElementsToBeClickable(LIST_OF_PRODUCTS_TITLES_A);
    }
    public WebElement getCatalogSmartphonesAndPhonesNokiaBtn() {
        return waitUntilElementToBeClickable(SMARTPHONES_AND_PHONES_NOKIA_A);
    }
    public WebElement getPlaypensBtn() {
        return waitUntilElementToBeClickable(PLAYPENS_A);
    }
}
