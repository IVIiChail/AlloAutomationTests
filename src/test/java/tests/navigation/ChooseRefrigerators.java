package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class ChooseRefrigerators extends AbstractBaseTest {
    @Test
    public void chooseRefrigerators(){
        AlloUaHomePageElements allo = new AlloUaHomePageElements(driver);
        goToAllo();
        allo.getCatalog().click();
        allo.moveOnCategoryHousehold();
        allo.getRefrigerators().click();

        Assert.assertTrue(getUrl().contains("ua/holodilniki/"));
        Assert.assertTrue(allo.getProductRefrigerators().getSize().height>1);

    }
}
