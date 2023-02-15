package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;
import pages.AlloUaResultPageElements;

public class GoToAlloTelegram extends AbstractBaseTest {
    @Test
    public void goToAlloTelegram() {
        AlloUaHomePageElements alloUaHomePageElements = new AlloUaHomePageElements(driver);
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);

        goToAllo();
        alloUaHomePageElements.getLinkAlloTelegram().click();
        alloUaHomePageElements.goToNextTab(2);

        Assert.assertTrue(urlContains("https://t.me/allonews"));
        Assert.assertEquals(alloUaResultPageElements.getLogoLogoName().getText(),"АЛЛО");
    }
}
