package tests.marketsPageTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class BodyTests  extends BaseTest {
    public BodyTests() {
        super("win_chrome");
    }

    @Test
    public void marketNavMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.clickByXpath("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//div[@class='market-nav-input-container']",
                "Screenshots/Markets_page/EnChrome/Screenshots_marketNavMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_marketNavMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_marketNavMarketsPage/difference.png", "FULL HD");
    }

    @Test
    public void marketsFilterMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.clickByXpath("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//div[@class='additional-merkets-filter']",
                "Screenshots/Markets_page/EnChrome/Screenshots_marketsFilterMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_marketsFilterMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_marketsFilterMarketsPage/difference.png", "FULL HD");
    }

    @Test
    public void tableHeadMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.clickByXpath("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//tr[@class='table-head-raw']",
                "Screenshots/Markets_page/EnChrome/Screenshots_tableHeadMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_tableHeadMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_tableHeadMarketsPage/difference.png", "FULL HD");
    }

    @Test
    public void filterListMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.clickByXpath("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//ul[@class='additional-filter-list']",
                "Screenshots/Markets_page/EnChrome/Screenshots_filterListMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_filterListMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_filterListMarketsPage/difference.png", "FULL HD");
    }
}
