package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class CheckPlayMarketButton extends AbstractBaseTest {
    @Test
    public void goToHomePageByLogo(){
        AlloUaHomePageElements allo = new AlloUaHomePageElements(driver);
        goToAllo();
        scrollToElement(allo.getDownloadPlMa());
        Assert.assertTrue(allo.getDownloadPlMa().isEnabled());

}
}
