package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;
import pages.AlloUaResultPageElements;

public class GoToGuaranteeReturn extends AbstractBaseTest {

    @Test
    public void goToGuaranteeReturn(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getForCustomersDropdownBtn().click();
        alloUaHomePageHelper.getGuaranteeReturnBtn().click();
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);

        Assert.assertTrue(urlContains("https://allo.ua/ua/warranty_and_service/"));
        Assert.assertEquals(alloUaResultPageElements.getGuaranteeAndServicePageTitle().getText(), "Гарантія та сервісні центри");
    }

}
