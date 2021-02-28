package tests;


import Base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.googleHomePage;

public class test extends TestBase {

    SoftAssert softAssert = new SoftAssert();
    googleHomePage homePage = new googleHomePage(driver);
    String sentenceToSearchAbout = "today Matches";

    @Test
    public void searchInGoogle() {
        googleHomePage homePage = new googleHomePage(driver);
        softAssert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/", "URL matches");
        homePage.googleBarSendKey(sentenceToSearchAbout);
        homePage.googleBarSearchConfirm();
        Assert.assertTrue(driver.getTitle().toString().contains(sentenceToSearchAbout));
    }

}
