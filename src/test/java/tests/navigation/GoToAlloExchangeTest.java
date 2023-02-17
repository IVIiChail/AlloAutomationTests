package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;
import pages.AlloUaResultPageElements;

public class GoToAlloExchangeTest extends AbstractBaseTest {
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
