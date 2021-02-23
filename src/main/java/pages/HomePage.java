package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertPage clickJSAlert() {
        clickLink("JavaScript Alerts");
        return new AlertPage(driver);
    }

    public FileUploadPage clickFileUploadPage() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditorPage() {
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingPage() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }


    public LargeAndDeepDomPage clickLargeAndDeepDomPage() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }


    public InfiniteScrollPage clickOnInfiniteScrollPage() {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
}
