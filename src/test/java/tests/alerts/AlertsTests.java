package tests.alerts;

import base.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends TestBase {
    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickJSAlert() ;
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(),"You successfully clicked an alert");

    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJSAlert() ;
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm");
    }

    @Test
    public void testInputInAlert() {
        var alertsPage = homePage.clickJSAlert();
        alertsPage.triggerPrompt();
        String text = "TAU rocks!" ;
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: TAU rocks!", "results text incorrect");
    }




}
