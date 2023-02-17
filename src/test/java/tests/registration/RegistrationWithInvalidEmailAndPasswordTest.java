package tests.registration;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageHelper;

public class RegistrationWithInvalidEmailAndPasswordTest extends AbstractBaseTest {

    @Test
    private void goToDownloadFromAppStore(){
        AlloUaHomePageHelper alloUaHomePageHelper = new AlloUaHomePageHelper(driver);
        alloUaHomePageHelper.goToHomePage();

        alloUaHomePageHelper.getProfileBtn().click();
        alloUaHomePageHelper.getRegistrationBtn().click();
        alloUaHomePageHelper.getRegistrationEmailInput().sendKeys("asdasd@g");
        alloUaHomePageHelper.getRegistrationPasswordInput().sendKeys("asdasedasd");
        alloUaHomePageHelper.getRegistrationSubmitBtn().click();


        Assert.assertTrue(alloUaHomePageHelper.getRegistrationEmailErrorSpan().getText().contains("Будь ласка, вкажіть коректний email"));
        Assert.assertTrue(alloUaHomePageHelper.getRegistrationPhoneErrorSpan().getText().contains("Це поле є обов'язковим для заповнення"));
    }
}
