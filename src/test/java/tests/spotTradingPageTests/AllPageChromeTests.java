package tests.spotTradingPageTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class AllPageChromeTests extends BaseTest {

    public AllPageChromeTests() {
        super("win_chrome");
    }
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Test
    public void allHeaderSpotTradingPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/spot/trading/BTCUSDT");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//div[@class='header-wrapper']",
                "Screenshots/Spot_Trading_page/EnChrome/Screenshots_allHeaderSpotTradingPage/real_life_screenshot.png",
                "Screenshots/Spot_Trading_page/EnChrome/Screenshots_allHeaderSpotTradingPage/mock_screenshot.png",
                "Screenshots/Spot_Trading_page/EnChrome/Screenshots_allHeaderSpotTradingPage/difference.png", "FULL HD");

    }
}
