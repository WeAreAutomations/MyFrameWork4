package tests.base;

import Common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.Action;
import pages.pixel_perfect.PixelPerfectExtra;
import pages.pixel_perfect.PixelPerfect;

import static Common.Config.CLEAR_COOKIES_AND_STORAGE;
import static Common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver;
    protected Action action;
    protected CommonActions commonActions;
    protected PixelPerfectExtra pixelPerfectExtra;
    protected PixelPerfect pixelPerfect;

    public BaseTest(String platformAndBrowser) {
        driver = CommonActions.createDriver(platformAndBrowser);
        action = new Action(driver);
        commonActions = new CommonActions();
        pixelPerfectExtra = new PixelPerfectExtra(driver);
        pixelPerfect = new PixelPerfect(driver);
    }


    @AfterTest
    public void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES_AND_STORAGE)
        {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            js.executeScript("window.sessionStorage.clear()");
        }
    }

//    @AfterSuite(alwaysRun = true)
//    public void close() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }


    @AfterSuite(alwaysRun = true)
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

}
