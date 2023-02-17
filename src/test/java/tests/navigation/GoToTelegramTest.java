package tests.navigation;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class GoToTelegramTest extends AbstractBaseTest{
        @Test
        public void goToTelegram(){
            AlloUaHomePageElements allo = new AlloUaHomePageElements(driver);
            driver.navigate();
            goToAllo();
            allo.getContactsUs().click();
            allo.getTelegram().click();
            allo.GoToTelegram();

            Assert.assertTrue(getUrl().contains("t.me/allohelp_bot"));
            Assert.assertTrue(allo.getAlloHelpBot().getText().contains("@allohelp_bot"));
        }

    }