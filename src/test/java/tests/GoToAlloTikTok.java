package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class GoToAlloTikTok extends AbstractBaseTest {
    @Test
    public void goToPaymentPartly() {
        AlloUaHomePageElements allo = new AlloUaHomePageElements(driver);
        goToAllo();
        allo.getTikTok().click();
        allo.goToTikTok();

        Assert.assertTrue(getUrl().contains("@allo.official"));
        Assert.assertTrue(allo.getTTUserAllo().isEnabled());

    }
}
