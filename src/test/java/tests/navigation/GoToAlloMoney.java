package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;
import pages.AlloUaResultPageElements;

public class GoToAlloMoney extends AbstractBaseTest {
    @Test
    public void goToAlloMoney() {
        AlloUaHomePageElements alloUaHomePageElements = new AlloUaHomePageElements(driver);

        goToAllo();
        alloUaHomePageElements.getLinkAlloMoney().click();

        Assert.assertTrue(urlContains("https://allo.ua/ua/loyalty-program/"));
        Assert.assertEquals(alloUaHomePageElements.getLinkAlloMoney().getText(),"АЛЛО Гроші");
    }

}
