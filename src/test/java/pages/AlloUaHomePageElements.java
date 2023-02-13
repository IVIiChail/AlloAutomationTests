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

    public static final String CONTACT_WITH_US_DROPDOWN_BUTTON = "//div[contains(@class,'mh-phone')]//button[contains(@class,'mh-button')]";

    public static final String DROPDOWN_MESSENGER_A = "//div[contains(@class,'mh-phone')]//a[descendant::span[contains(text(),'Messenger')]]";

    public WebElement getGuaranteeReturnBtn(){
        return waitUntilElementToBeClickable(DROPDOWN_GUARANTY_RETURN_A);
    }

    public WebElement getForCustomersDropdownBtn(){
        return waitUntilElementToBeClickable(FOR_CUSTOMERS_DROPDOWN_A);
    }

    public WebElement getContactWithUsDropDownBtn(){
        return waitUntilElementToBeClickable(CONTACT_WITH_US_DROPDOWN_BUTTON);
    }

    public WebElement getDropDownMessengerBtn(){
        return waitUntilElementToBeClickable(DROPDOWN_MESSENGER_A);
    }


}
