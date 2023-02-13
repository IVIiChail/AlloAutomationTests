package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;
import pages.AlloUaResultPageElements;

public class GoToMessenger extends AbstractBaseTest {

    @Test
    public void goToMessenger(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getContactWithUsDropDownBtn().click();
        alloUaHomePageHelper.getDropDownMessengerBtn().click();
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);
        alloUaResultPageElements.goToNextTab(2);

        Assert.assertTrue(urlContains("https://www.messenger.com/"));
    }
}
