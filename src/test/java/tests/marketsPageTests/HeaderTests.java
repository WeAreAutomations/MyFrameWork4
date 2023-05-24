package tests.marketsPageTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class HeaderTests extends BaseTest {
    public HeaderTests() {
        super("win_chrome");
    }

    @Test
    public void all_header_markets_page() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.clickByXpath("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//div[@class='header-wrapper']",
                "Screenshots/Markets_page/EnChrome/Screenshots_all_header/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_all_header/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_all_header/difference.png", "FULL HD");

    }

    @Test
    public void trade_nav_markets_page() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.clickByXpath("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("(//li[@class='header-nav-item item-relative'])[1]");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("(//div[@class='menu-wrapper'])[1]",
                "Screenshots/Markets_page/EnChrome/Screenshots_trade_nav/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_trade_nav/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_trade_nav/difference.png", "FULL HD");

    }

    @Test
    public void products_nav_markets_page() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.clickByXpath("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='products']");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("(//div[@class='menu-wrapper'])[2]",
                "Screenshots/Markets_page/EnChrome/Screenshots_products_nav/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_products_nav/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_products_nav/difference.png", "FULL HD");

    }

    @Test
    public void company_nav_markets_page() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.clickByXpath("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='company']");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("(//div[@class='menu-wrapper'])[3]",
                "Screenshots/Markets_page/EnChrome/Screenshots_company_nav/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_company_nav/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_company_nav/difference.png", "FULL HD");

    }

    @Test
    public void profile_nav_markets_page() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.clickByXpath("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//div[@data-test-id='profile']");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("(//div[@class='menu-wrapper'])[4]",
                "Screenshots/Markets_page/EnChrome/Screenshots_profile_nav/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_profile_nav/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_profile_nav/difference.png", "FULL HD");

    }

    @Test
    public void markets_title_markets_page() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/markets");
        action.waitElementIsVisible("//div[@class='markets-container']");
//        action.clickByXpath("//button[@class=\"close-button\"]");
//        action.hoverOverAnElementByXpath("(//span[@class=\"nav-title\"])[2]");
        pixelPerfect.byElement("//h1[@class='markets-title']",
                    "Screenshots/Markets_page/EnChrome/Screenshots_markets_title/real_life_screenshot.png",
                    "Screenshots/Markets_page/EnChrome/Screenshots_markets_title/mock_screenshot.png",
                    "Screenshots/Markets_page/EnChrome/Screenshots_markets_title/difference.png", "FULL HD");
    }

//    @Test
//    public void markets_info_container_markets_page() throws IOException, InterruptedException {
//        action.openPage("https://dex-trade.com/markets");
//        action.waitElementIsVisible("//div[@class='markets-container']");
////        action.clickByXpath("//button[@class=\"close-button\"]");
////        action.hoverOverAnElementByXpath("(//span[@class=\"nav-title\"])[2]");
//        pixelPerfect.byElement("//ul[@class='markets-info-list']",
//                "Screenshots/Markets_page/EnChrome/Screenshots_markets_info_container/real_life_screenshot.png",
//                "Screenshots/Markets_page/EnChrome/Screenshots_markets_info_container/mock_screenshot.png",
//                "Screenshots/Markets_page/EnChrome/Screenshots_markets_info_container/difference.png", "FULL HD");
//    }

}
