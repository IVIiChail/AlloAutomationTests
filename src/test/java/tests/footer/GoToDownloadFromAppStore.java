package tests.footer;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;
import pages.AlloUaHomePageHelper;
import pages.AlloUaResultPageElements;

public class GoToDownloadFromAppStore extends AbstractBaseTest {

    @Test
    private void goToDownloadFromAppStore(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getDownloadWithAppStoreBtn().click();
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);
        alloUaResultPageElements.goToNextTab(2);

        Assert.assertTrue(getUrl().contains("https://apps.apple.com/ua/app"));
        Assert.assertTrue(alloUaResultPageElements.getAppStoreAlloTitle().getText().contains("Алло: Тицяй Що Хочеш"));
    }
}
