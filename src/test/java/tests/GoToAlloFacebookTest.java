package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class GoToAlloFacebookTest extends AbstractBaseTest {
    @Test
    public void goToAlloFacebook(){
        AlloUaHomePageElements allo = new AlloUaHomePageElements(driver);
        goToAllo();
        allo.getFacebook().click();
        allo.goToFacebook();

        Assert.assertTrue(getUrl().contains("https://www.facebook.com/allo"));
        Assert.assertTrue(allo.getUserNameAllo().isEnabled());
    }
}
