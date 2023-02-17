package tests.login;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;
import pages.AlloUaResultPageElements;

public class LoginWithInvalidEmailAndPaasword extends AbstractBaseTest {

    @Test
    private void goToDownloadFromAppStore(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getProfileBtn().click();
        alloUaHomePageHelper.getLoginEmailInput().sendKeys("asdasd@g");
        alloUaHomePageHelper.getLoginPasswordInput().sendKeys("asdasedasd");
        alloUaHomePageHelper.getLoginSubmitBtn().click();


        Assert.assertTrue(alloUaHomePageHelper.getLoginErrorSpan().getText().contains("Будь ласка, вкажіть коректний email"));
    }
}
