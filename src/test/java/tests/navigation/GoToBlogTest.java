package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;
import pages.AlloUaResultPageElements;

public class GoToBlogTest extends AbstractBaseTest {

    @Test
    public void goToBlog(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getForCustomersDropdownBtn().click();
        alloUaHomePageHelper.getDropDownBlogBtn().click();
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);
        alloUaResultPageElements.goToNextTab(2);

        Assert.assertTrue(urlContains("https://blog.allo.ua/ua/golovna/"));
        Assert.assertEquals(alloUaResultPageElements.getHeaderBlogAlloLogo().getAttribute("alt"),"Блог АЛЛО");
    }
}
