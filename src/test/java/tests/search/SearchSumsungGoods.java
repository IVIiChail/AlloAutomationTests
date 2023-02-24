package tests.search;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUaHomePageElements;

public class SearchSumsungGoods extends AbstractBaseTest {
    @Test
    public void SearchSumsungGoods() {
        AlloUaHomePageElements alloUaHomePageElements = new AlloUaHomePageElements(driver);

        goToAllo();
        alloUaHomePageElements.getSearchFieldHomePageAllo().sendKeys("Самсунг");
        alloUaHomePageElements.getBtnSearchFieldHomePageAllo().click();

        Assert.assertTrue(alloUaHomePageElements.getResaltsSearchElementsSamsung().size()>1);
        Assert.assertTrue(alloUaHomePageElements.getResaltsSearchElementsSamsung().stream().allMatch(el -> el.getText().contains("Samsung")));
    }
}
