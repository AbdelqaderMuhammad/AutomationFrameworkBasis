package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver ;

    private By inputField = By.id("file-upload") ;
    private By uploadField = By.id("file-submit") ;
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadField).click();
    }

    public void uploadFile(String absolutePathOfFile) {
        driver.findElement(uploadField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }

}
