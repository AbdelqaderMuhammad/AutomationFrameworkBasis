package tests;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementExamples extends TestBase {

    @Test
    public void test() {
        // scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver ;
        WebElement shiftingContentBtn = driver.findElement(By.cssSelector("[href='/shifting_content']")) ;
        js.executeScript("arguments[0].scrollIntoView();", shiftingContentBtn) ;
        shiftingContentBtn.click();
        WebElement MenuElementBtn = driver.findElement(By.cssSelector("a[href='/shifting_content/menu']")) ;
        MenuElementBtn.click();
        List<WebElement> options = driver.findElements(By.cssSelector("ul > li")) ;
        System.out.println(options.size());
    }


}
