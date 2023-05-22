package tests.marketsPageTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class Header_Tests extends BaseTest {
    public Header_Tests() {
        super("win_chrome");
    }
//    public Header_Tests() {
//        super("win_firefox");
//    }

    @Test
    public void all_header() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.clickByXpath("//button[@class=\"close-button\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//div[@class='header-wrapper']",
                "Screenshots/Markets_page/EnChrome/Screenshots_all_header/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_all_header/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_all_header/difference.png", "FULL HD");

    }

    @Test
    public void markets_title() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/markets");
        action.waitElementIsVisible("//div[@class='markets-container']");
//        action.clickByXpath("//button[@class=\"close-button\"]");
//        action.hoverOverAnElementByXpath("(//span[@class=\"nav-title\"])[2]");
        pixelPerfect.byElement("//h1[@class='markets-title']",
                    "Screenshots/Markets_page/EnChrome/Screenshots_markets_title/real_life_screenshot.png",
                    "Screenshots/Markets_page/EnChrome/Screenshots_markets_title/mock_screenshot.png",
                    "Screenshots/Markets_page/EnChrome/Screenshots_markets_title/difference.png", "FULL HD");
    }

    @Test
    public void markets_info_container() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/markets");
        action.waitElementIsVisible("//div[@class='markets-container']");
//        action.clickByXpath("//button[@class=\"close-button\"]");
//        action.hoverOverAnElementByXpath("(//span[@class=\"nav-title\"])[2]");
        pixelPerfect.byElement("//ul[@class='markets-info-list']",
                "Screenshots/Markets_page/EnChrome/Screenshots_markets_info_container/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_markets_info_container/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_markets_info_container/difference.png", "FULL HD");
    }

}
