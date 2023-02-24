package tests.search;

import base.AbstractBasePage;
import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;
import pages.AlloUaResultPageElements;

public class ChooseProtectiveGlass_in_Accessories_of_Mobiles extends AbstractBaseTest {
    @Test
    public void chooseProtectiveGlass_in_Accessories_of_Mobiles() {
        AlloUaHomePageElements alloUaHomePageElements = new AlloUaHomePageElements(driver);
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);

        goToAllo();
        alloUaHomePageElements.getCatalog().click();
        alloUaHomePageElements.moveOnLinkSmartphonesAndPhones().getFieldSaveGlassOnSmartphones().click();

        Assert.assertTrue(urlContains("https://allo.ua/ua/zaschitnye-stekla-k-telefonam/"));
        Assert.assertTrue(alloUaResultPageElements.getListResultsSaveGlasses().size()>1);
        Assert.assertTrue(alloUaResultPageElements.getListResultsSaveGlasses().stream().allMatch(el -> el.getText().contains("Захисне скло")));
    }
}
