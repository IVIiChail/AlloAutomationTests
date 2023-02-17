package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;

public class SearchZhytomyrCityInChooseCityMenuTest extends AbstractBaseTest {

    @Test
    public void goToGuaranteeReturn(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.chooseSearchedCity("Житомир");

        Assert.assertTrue(urlContains("https://allo.ua/ua/zhitomir/"));
        Assert.assertEquals(alloUaHomePageHelper.getCityChooseBtn().getText(), "Житомир");

    }
}
