package tests.keys;

import base.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends TestBase {
    @Test
    public void testBackspace() {
        var keyPage = homePage.clickKeyPresses() ;
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE") ;

    }


    @Test
    public void testPi() {
        var keyPaga = homePage.clickKeyPresses() ;
        keyPaga.enterPi();
    }
}
