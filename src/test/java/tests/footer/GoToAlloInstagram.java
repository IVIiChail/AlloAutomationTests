package tests.footer;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;
import pages.AlloUaResultPageElements;

public class GoToAlloInstagram extends AbstractBaseTest {

    @Test
    private void goToDownloadFromAppStore(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getFooterInstagramBtn().click();
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);
        alloUaResultPageElements.goToNextTab(2);

        Assert.assertTrue(getUrl().contains("https://www.instagram.com/allo/"));
        Assert.assertTrue(alloUaResultPageElements.getInstagramTitle().getText().contains("allo"));
    }
}
