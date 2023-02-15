package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class GoToShopWithDniproCity extends AbstractBaseTest {
    @Test
    public void GoToStores(){
        AlloUaHomePageElements allo = new AlloUaHomePageElements(driver);
        goToAllo();
        allo.getCityButton().click();
        allo.getDnipro().click();
        allo.waitUntilUrlContainsText("https://allo.ua/ua/dnipro/");
        allo.getStores().click();

        Assert.assertTrue(getUrl().contains("dnipro/offline_stores/"));
        Assert.assertEquals(allo.getContentTitleH1().getText(),"Адреса магазинів АЛЛО у Дніпрі");
        Assert.assertTrue(allo.getLocLabel().isEnabled());
        Assert.assertTrue(allo.getTdAddress().size()>1);
    }
}
