package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class SearchUnvalidGoods extends AbstractBaseTest {
    @Test
    public void goToSearchUnvalidGoods() {
        AlloUaHomePageElements allo = new AlloUaHomePageElements(driver);
        goToAllo();
        allo.getSearchField().sendKeys("бвощчт");
        allo.getSearchBtn().click();

        Assert.assertTrue(allo.getCatalogEmpty().getText().contains("Нажаль, нічого не знайдено"));
        Assertions.assertThat(getUrl().contains("https://allo.ua/ua/catalogsearch/result/"));
    }
}
