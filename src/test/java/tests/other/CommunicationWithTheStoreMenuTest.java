package tests.other;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;

public class CommunicationWithTheStoreMenuTest extends AbstractBaseTest {

    @Test
    public void communicationWithTheStoreMenuTest(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getCommunicationBtn().click();

        Assert.assertTrue(alloUaHomePageHelper.getCommunicationViberBtn().isEnabled());
        Assert.assertTrue(alloUaHomePageHelper.getCommunicationTelegramBtn().isEnabled());
        Assert.assertTrue(alloUaHomePageHelper.getCommunicationMessengerBtn().isEnabled());
        Assert.assertTrue(alloUaHomePageHelper.getCommunicationPhoneBtn().isEnabled());
    }
}
