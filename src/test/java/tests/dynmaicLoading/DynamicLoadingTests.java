package tests.dynmaicLoading;

import base.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends TestBase {
    @Test
    public void testWaitUntilExample1() {
        var loadingPage = homePage.clickDynamicLoadingPage().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!");
    }
}
