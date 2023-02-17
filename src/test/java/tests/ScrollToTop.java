package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class ScrollToTop extends AbstractBaseTest {
    @Test
    public void scroolToTop() {
        AlloUaHomePageElements allo = new AlloUaHomePageElements(driver);
        goToAllo();
        scrollToElement(allo.getOfficailRepresent());
        allo.getOfficailRepresent().click();

        Assert.assertTrue(allo.getOfficailRepresent().isEnabled());
        Assert.assertTrue(allo.getRepresentations().isEnabled());
    }
}
