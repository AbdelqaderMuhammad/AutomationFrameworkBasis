package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;
import pages.HomePage;

public class TestBase {

    public static WebDriver driver;
    protected HomePage homePage ;

    @BeforeSuite(enabled = false)
    @Parameters({"browser"})
    public void startDriver(@Optional("chrome") String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");

    }

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver() ;
        driver.get("https://the-internet.herokuapp.com/") ;
        driver.manage().window().maximize();
        homePage = new HomePage(driver) ;
        // to put the size of an iphone
        //  driver.manage().window().setSize(new Dimension(375, 812));
    }


    @AfterSuite(enabled = false)
    public void stopDriver() {
        driver.close();
    }


}
