package tests.search;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;
import pages.AlloUaResultPageElements;

public class ChoosePlaypensInGoodsForChildren extends AbstractBaseTest {

    @Test
    public void choosePlaypensInGoodsForChildren(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getGoodsForChildren().click();
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);
        alloUaResultPageElements.getPlaypensBtn().click();

        Assert.assertTrue(urlContains("https://allo.ua/ua/manezhi/"));
        Assert.assertTrue(alloUaResultPageElements.getGoodsTitles().size()>1);
        Assert.assertTrue(alloUaResultPageElements.getGoodsTitles().stream().allMatch(el -> el.getText().toLowerCase().contains("манеж")));
    }

}
