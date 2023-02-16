package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class GoToSiteConditions extends AbstractBaseTest {
    @Test
    public void Go_to_Site_Conditions() {
        AlloUaHomePageElements alloUaHomePageElements = new AlloUaHomePageElements(driver);

        goToAllo();
        alloUaHomePageElements.getLinkSiteConditions().click();

        Assert.assertTrue(urlContains("https://allo.ua/ua/terms_of_use/"));
        Assert.assertEquals(alloUaHomePageElements.getHeaderNameSiteCondotions().getText(),"Угода користувача");
    }
}
