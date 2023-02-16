package tests.navigation;

import base.AbstractBasePage;
import base.AbstractBaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;
import pages.AlloUaResultPageElements;

public class GoToAlloExchange extends AbstractBaseTest {
    @Test
    public void goToAlloExchange () {
        AlloUaHomePageElements alloUaHomePageElements = new AlloUaHomePageElements(driver);
        AlloUaResultPageElements alloUaResultPageElements = new AlloUaResultPageElements(driver);

        goToAllo();
        alloUaHomePageElements.getLinkAlloExchange().click();


        Assert.assertTrue(urlContains("https://allo.ua/ua/tradein/"));
        Assert.assertEquals(alloUaResultPageElements.getResault_LinkAlloExchenge().getText(),"АЛЛО Обмін");
    }


}
