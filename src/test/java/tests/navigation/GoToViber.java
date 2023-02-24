package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;
import pages.AlloUaResultPageElements;

public class GoToViber extends AbstractBaseTest {
    @Test
    public void goToViber() {
        AlloUaHomePageElements alloUaHomePageElements = new AlloUaHomePageElements(driver);
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);

        goToAllo();
        alloUaHomePageElements.getContact_Us().click();
        alloUaHomePageElements.getLinkViberBtn().click();
        alloUaHomePageElements.goToNextTab(2);

        Assert.assertTrue(urlContains("https://chats.viber.com/allo"));
        Assert.assertEquals(alloUaResultPageElements.getTitleAllo_Bot().getText(),"ALLO bot");
    }


}
