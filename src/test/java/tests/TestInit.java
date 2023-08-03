package tests;

import driver.Browser;
import driver.DriverFactory;
import driver.DriverPoll;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utiles.Config;
import utiles.PropertiesUtil;

import static utiles.Config.setBaseUrl;

public abstract class TestInit {

    @BeforeMethod
    public void setUpDriver() {
        WebDriver driver = DriverFactory.getDriver(Browser.CHROME);
        DriverPoll.setWebDriver(driver);
        Config.setBaseUrl("https://www.saucedemo.com/");
        driver.get(Config.getBaseUrl());

    }

    @AfterMethod
    public void quiteDriver() {
        DriverPoll.quitDriver();
    }
}
