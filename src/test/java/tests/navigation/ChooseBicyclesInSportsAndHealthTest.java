package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;
import pages.AlloUaResultPageElements;

public class ChooseBicyclesInSportsAndHealthTest extends AbstractBaseTest {

    @Test
    public void chooseBicyclesInSportsAndHealth(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getSportAndHealthBtn().click();
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);
        alloUaResultPageElements.getBicyclesBtn().click();

        Assert.assertTrue(urlContains("https://allo.ua/ua/velosipedy/"));
        Assert.assertTrue(alloUaResultPageElements.getGoodsTitles().size()>1);
        Assert.assertTrue(alloUaResultPageElements.getGoodsTitles().stream().allMatch(el -> el.getText().contains("Велосипед")));
    }
}
