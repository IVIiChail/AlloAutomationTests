package tests.other;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;

public class AddGoodToBasketTest extends AbstractBaseTest {

    @Test
    public void addGoodToBasketTest(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getFirstElementTopSalesBuyBtn().click();

        Assert.assertTrue(alloUaHomePageHelper.getCartListOfItems().size()==1);
    }
}
