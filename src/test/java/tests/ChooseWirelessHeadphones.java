package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class ChooseWirelessHeadphones extends AbstractBaseTest {
    @Test
    public void chooseWirelessHeadphones() {
        AlloUaHomePageElements allo = new AlloUaHomePageElements(driver);
        goToAllo();
        allo.getCatalog().click();
        allo.moveOnCategoryAudio();
        allo.getWireless().click();

        Assert.assertTrue(getUrl().contains("naushniki-besprovodnoe/"));
        Assert.assertTrue(allo.productWireless().getSize().height>1);
        Assert.assertTrue(allo.productWireless().getText().contains("Навушники"));


    }
}
