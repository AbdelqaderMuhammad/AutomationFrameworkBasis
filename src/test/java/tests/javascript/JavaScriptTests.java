package tests.javascript;

import base.TestBase;
import org.testng.annotations.Test;

public class JavaScriptTests extends TestBase {

    @Test(enabled = false)
    public void TestScrollToTable() {
        var LargeAndDeepDomObj = homePage.clickLargeAndDeepDomPage() ;
        LargeAndDeepDomObj.scrollToTable();
    }

    @Test
    public void TestScrollToParagraph() {
        var infiniteScrollObj = homePage.clickOnInfiniteScrollPage() ;
        infiniteScrollObj.scrollToParagraph(5);
    }

}
