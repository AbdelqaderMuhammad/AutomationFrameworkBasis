package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleHomePage {

    public WebDriver driver;

    public googleHomePage(WebDriver driver) {
        this.driver = driver ;
    }


    private final WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));

    public void googleBarSendKey(String sentence) {
        searchBar.sendKeys(sentence);
    }

    public void googleBarSearchConfirm() {
        searchBar.sendKeys(Keys.ENTER);
    }

}
