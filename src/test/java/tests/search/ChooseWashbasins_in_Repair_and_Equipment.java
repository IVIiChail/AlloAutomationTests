package tests.search;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;
import pages.AlloUaResultPageElements;

public class ChooseWashbasins_in_Repair_and_Equipment extends AbstractBaseTest {
    @Test
    public void choose_Washbasins_in_Repair_and_Equipment() {
        AlloUaHomePageElements alloUaHomePageElements = new AlloUaHomePageElements(driver);
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);

        goToAllo();
        alloUaHomePageElements.getCatalog().click();
        alloUaHomePageElements.moveLinkRepairAndEquipment().getFieldWashBasins().click();

        Assert.assertTrue(urlContains("https://allo.ua/ua/umyval-niki/"));
        Assert.assertTrue(alloUaResultPageElements.getListResultsWashBasins().size()>1);
        Assert.assertTrue(alloUaResultPageElements.getListResultsWashBasins().stream().allMatch(el -> el.getText().contains("Умивальник")||el.getText().contains("Раковина")));
    }
}
