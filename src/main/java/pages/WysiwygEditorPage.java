package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIFrameID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentionBtn = By.xpath("//button[@title='Increase indent']");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextArea() {
        switchToEditorFrame();
        driver.findElement(textArea).clear();
        switchToMainFrame();
    }

    public void setTextArea(String text) {
        switchToEditorFrame();
        driver.findElement(textArea).sendKeys(text);
        switchToMainFrame();
    }

    public void increaseIndention() {
        driver.findElement(increaseIndentionBtn).click();
    }

    public String getTextFromEditor() {
        switchToEditorFrame();
        String text = driver.findElement(textArea).getText();
        switchToMainFrame();
        return text ;
    }

    private void switchToEditorFrame() {
        driver.switchTo().frame(editorIFrameID);
    }

    private void switchToMainFrame() {
        driver.switchTo().parentFrame();
    }


}
