package tests.other;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;

public class ComunicationWithTheStoreMenuTest extends AbstractBaseTest {

    @Test
    public void comunicationWithTheStoreMenuTest(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getFirstElementTopSalesBuyBtn().click();
        alloUaHomePageHelper.getFirstElementCartDeleteSvg().click();

        Assert.assertTrue(alloUaHomePageHelper.getCartIsEmptyP().getText().contains("Ваш кошик порожній"));
    }
}
