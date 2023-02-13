package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloUaResultPageElements extends AbstractBasePage {
    public AlloUaResultPageElements(WebDriver driver) {
        super(driver);
    }

    public static final String GUARANTEE_AND_SERVICE_PAGE_TITLE_H4 = "//h4[contains(@class,'page-head')]";

    public WebElement getGuaranteeAndServicePageTitle(){
        return waitUntilElementToBeClickable(GUARANTEE_AND_SERVICE_PAGE_TITLE_H4);
    }
}
