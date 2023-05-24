package tests.marketsPageTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class BodyTests  extends BaseTest {
    public BodyTests() {
        super("win_chrome");
    }

    @Test
    public void market_nav_markets_page() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        action.clickByXpath("//button[@class=\"close-button\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//div[@class='market-nav-input-container']",
                "Screenshots/Markets_page/EnChrome/Screenshots_market_nav/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_market_nav/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_market_nav/difference.png", "FULL HD");
    }

    @Test
    public void markets_filter_markets_page() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        action.clickByXpath("//button[@class=\"close-button\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//div[@class='additional-merkets-filter']",
                "Screenshots/Markets_page/EnChrome/Screenshots_markets_filter/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_markets_filter/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_markets_filter/difference.png", "FULL HD");
    }

    @Test
    public void table_head_markets_page() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        action.clickByXpath("//button[@class=\"close-button\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//tr[@class='table-head-raw']",
                "Screenshots/Markets_page/EnChrome/Screenshots_table_head/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_table_head/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_table_head/difference.png", "FULL HD");
    }

    @Test
    public void filter_list_markets_page() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        action.clickByXpath("//button[@class=\"close-button\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//ul[@class='additional-filter-list']",
                "Screenshots/Markets_page/EnChrome/Screenshots_filter_list/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_filter_list/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_filter_list/difference.png", "FULL HD");
    }
}
