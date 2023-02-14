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

    public WebElement getGuaranteeReturnBtn(){
        return waitUntilElementToBeClickable(DROPDOWN_GUARANTY_RETURN_A);
    }

    public WebElement getForCustomersDropdownBtn(){
        return waitUntilElementToBeClickable(FOR_CUSTOMERS_DROPDOWN_A);
    }

    public static final String HEADER_CONTACTS_US = "//span[@class='mh-phone__title']";
    public static final String TELEGRAM_BTN = "(//span[@class='contacts__label'])[2]";
    public static final String ALLO_HELP_BOT ="//div[contains(text(),'@allohelp_bot')]";
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
}
