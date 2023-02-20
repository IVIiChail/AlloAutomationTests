package tests.navigation;

import base.AbstractBasePage;
import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class Go_to_Delivery_and_Payment extends AbstractBaseTest {
    @Test
    public void go_To_Delivery_and_Payment() {
        AlloUaHomePageElements alloUaHomePageElements = new AlloUaHomePageElements(driver);

        goToAllo();
        alloUaHomePageElements.getBuyers().click();
        alloUaHomePageElements.getLink_Delivery_and_Paymant().click();

        Assert.assertTrue(urlContains("https://allo.ua/ua/help/shipment_payment/"));
        Assert.assertEquals(alloUaHomePageElements.getHeader_Title_Del_and_Paym().getText(),"Доставка і оплата");
    }
}