package tests.registration;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class Login_without_any_data extends AbstractBaseTest {
    @Test
    public void login_without_any_data() {
        AlloUaHomePageElements alloUaHomePageElements = new AlloUaHomePageElements(driver);

        goToAllo();
        alloUaHomePageElements.getProfileBtn().click();
        alloUaHomePageElements.getRegistrationSubmitBtn().click();

        Assert.assertEquals(alloUaHomePageElements.getField_Result_Login_Open().getText(),"Це поле є обов'язковим для заповнення.");
        Assert.assertEquals(alloUaHomePageElements.getField_Result_Password_Open().getText(),"Це поле є обов'язковим для заповнення.");
    }
}
