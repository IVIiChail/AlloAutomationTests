package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class GoToPaymentPartly extends AbstractBaseTest {
    @Test
    public void goToPaymentPartly(){
        AlloUaHomePageElements allo = new AlloUaHomePageElements(driver);
        goToAllo();
        allo.getBuyers().click();
        allo.getBuyPartly().click();
        allo.waitUntilUrlContainsText("oplata-chastami/");

        Assert.assertTrue(getUrl().contains("oplata-chastami/"));
        Assert.assertEquals(allo.getContentTitleH2().getText(),"Обирайте товар та сплачуйте його частинами");
    }
}
