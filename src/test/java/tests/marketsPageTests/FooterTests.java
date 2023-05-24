package tests.marketsPageTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class FooterTests extends BaseTest {
    public FooterTests() {
        super("win_chrome");
    }
    @Test
    public void all_footer_markets_page() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        // C
        action.clickByXpath("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//footer[@class='footer']",
                "Screenshots/Markets_page/EnChrome/Screenshots_all_footer/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_all_footer/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_all_footer/difference.png", "FULL HD");

        }

    @Test
    public void lang_footer_markets_page() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        // C
        action.clickByXpath("//button[@class='close-button']");
        // Click lang
        action.clickByXpath("//div[@data-test-id='lang-footer']");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//div[@class='dropdown-container language-container footer-lang-style']",
                "Screenshots/Markets_page/EnChrome/Screenshots_lang_footer/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_lang_footer/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_lang_footer/difference.png", "FULL HD");

    }
}
