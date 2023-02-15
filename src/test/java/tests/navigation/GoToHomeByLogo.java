package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class GoToHomeByLogo extends AbstractBaseTest {
    @Test
    public void goToHomePageByLogo(){
        AlloUaHomePageElements allo = new AlloUaHomePageElements(driver);
        GoToAllo();
        allo.getDiscountMiddle().click();
        allo.returnToHomePageByLogo().click();

        Assert.assertTrue(getUrl().contains("https://allo.ua/"));
    }
}
