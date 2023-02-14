package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;
import pages.AlloUaResultPageElements;

public class GetNokiaSmartphonesFromCatalog extends AbstractBaseTest {

    @Test
    public void getNokiaSmartphonesFromCatalog(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getCatalogSmartphonesAndPhonesBtn().click();
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);
        alloUaResultPageElements.getCatalogSmartphonesAndPhonesNokiaBtn().click();

        Assert.assertTrue(urlContains("https://allo.ua/ua/products/mobile/proizvoditel-nokia/"));
        Assert.assertTrue(alloUaResultPageElements.getGoodsTitles().size()>1);
        Assert.assertTrue(alloUaResultPageElements.getGoodsTitles().stream().allMatch(el -> el.getText().contains("Nokia")));
    }
}
