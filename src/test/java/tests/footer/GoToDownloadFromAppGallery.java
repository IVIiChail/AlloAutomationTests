package tests.footer;

import base.AbstractBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class GoToDownloadFromAppGallery extends AbstractBaseTest {
    @Test
    public void goToDownloadFromAppGallery() {
        AlloUaHomePageElements alloUaHomePageElements = new AlloUaHomePageElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        goToAllo();
        WebElement Element = driver.findElement(By.xpath("//a[contains(@class,'footer-apps__link--appgallery')]"));
        js.executeScript("arguments[0].scrollIntoView();",Element);
        alloUaHomePageElements.getBtnDownloadAppGalery().click();
        alloUaHomePageElements.goToNextTab(2);

        Assert.assertTrue(getUrl().contains("https://appgallery.huawei.com/#/app/C100861561"));
        Assert.assertTrue(alloUaHomePageElements.getNameAppGallery().getText().contains("Алло: тицяй що хочеш"));
    }
}
