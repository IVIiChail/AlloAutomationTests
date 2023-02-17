package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class GoToDiscountsTest extends AbstractBaseTest {
    @Test
    public void goToDiscount(){
        AlloUaHomePageElements allo = new AlloUaHomePageElements(driver);
        goToAllo();
        allo.getDiscount().click();

        Assert.assertTrue(getUrl().contains("events-and-discounts/"));
        Assert.assertTrue(allo.getPromoTiltle().getText().contains("Акції"));
    }
}
