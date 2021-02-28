package tests.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.googleHomePage;

import java.util.concurrent.TimeUnit;

public class googleSearchSteps {

    public static WebDriver driver;
    googleHomePage googleSearchPage ;

    @Given("browser is open.")
    public void browser_is_open() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("user is on google search page.")
    public void user_is_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");

    }

    @When("^user enters a (.*) in google search box.$")
    public void user_enters_a_text_in_google_search_box(String sentence) {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        googleSearchPage = new googleHomePage(driver) ;
        googleSearchPage.googleBarSendKey(sentence);
    }

    @When("hits enter.")
    public void hits_enter() {
        // Write code here that turns the phrase above into concrete actions
        googleSearchPage.googleBarSearchConfirm();
    }

    @Then("^User will be directed to the result page where (.*) resides.$")
    public void user_will_be_directed_to_the_result_page(String sentence) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.getTitle().contains(sentence));
    }

}
