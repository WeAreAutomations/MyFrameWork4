package tests.termsofUse;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class TermsOfUse extends BaseTest {
    public TermsOfUse() {
        super("win_chrome");
    }

    @Test
    public void termsOfUseHeader() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/info/terms-of-use");

        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");

        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//div[@class=\"header-wrapper\"]",
                "Screenshots/termsOfUse/EnChrome/screenshots_termsOfUseHederTest/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/screenshots_termsOfUseHederTest/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/screenshots_termsOfUseHederTest/difference.png");

    }

    @Test
    public void termsOfUseTextPart1() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/difference.png");

    }

    @Test
    public void termsOfUseTextPart2() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,860");
//        Thread.sleep(12000);
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart2/EnChrome/screenshots_termsOfUseHederTestPart2/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart2/EnChrome/screenshots_termsOfUseHederTestPart2/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart2/EnChrome/screenshots_termsOfUseHederTestPart2/difference.png");

    }

    @Test
    public void termsOfUseTextPart3() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,1717");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart3/EnChrome/screenshots_termsOfUseHederTestPart3/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart3/EnChrome/screenshots_termsOfUseHederTestPart3/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart3/EnChrome/screenshots_termsOfUseHederTestPart3/difference.png");

    }

    @Test
    public void termsOfUseTextPart4() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,2576");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart4/EnChrome/screenshots_termsOfUseHederTestPart4/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart4/EnChrome/screenshots_termsOfUseHederTestPart4/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart4/EnChrome/screenshots_termsOfUseHederTestPart4/mock_screenshot.png");

    }

    @Test
    public void termsOfUseTextPart5() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,3433");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart5/EnChrome/screenshots_termsOfUseHederTestPart5/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart5/EnChrome/screenshots_termsOfUseHederTestPart5/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart5/EnChrome/screenshots_termsOfUseHederTestPart5/difference.png");

    }

    @Test
    public void termsOfUseTextPart6() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,4292");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart6/EnChrome/screenshots_termsOfUseHederTestPart6/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart6/EnChrome/screenshots_termsOfUseHederTestPart6/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart6/EnChrome/screenshots_termsOfUseHederTestPart6/difference.png");

    }

    @Test
    public void termsOfUseTextPart7() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,5150");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart7/EnChrome/screenshots_termsOfUseHederTestPart7/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart7/EnChrome/screenshots_termsOfUseHederTestPart7/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart7/EnChrome/screenshots_termsOfUseHederTestPart7/difference.png");

    }

    @Test
    public void termsOfUseTextPart8() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.scrollPage("0,6009");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart8/EnChrome/screenshots_termsOfUseHederTestPart8/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart8/EnChrome/screenshots_termsOfUseHederTestPart8/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart8/EnChrome/screenshots_termsOfUseHederTestPart8/difference.png");

    }

    @Test
    public void termsOfUseTextPart9() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,6863");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart9/EnChrome/screenshots_termsOfUseHederTestPart9/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart9/EnChrome/screenshots_termsOfUseHederTestPart9/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart9/EnChrome/screenshots_termsOfUseHederTestPart9/difference.png");

    }

        @Test
        public void termsOfUseTextPart10() throws IOException, InterruptedException {
            action.openPage("https://dex-trade.com/info/terms-of-use");
            action.waitElementIsVisible("//a[@data-test-id='header login']");
            action.scrollPage("0,7719");
            pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                    "Screenshots/termsOfUseTextPart10/EnChrome/screenshots_termsOfUseHederTestPart10/real_life_screenshot.png",
                    "Screenshots/termsOfUseTextPart10/EnChrome/screenshots_termsOfUseHederTestPart10/mock_screenshot.png",
                    "Screenshots/termsOfUseTextPart10/EnChrome/screenshots_termsOfUseHederTestPart10/difference.png");

        }
    @Test
    public void termsOfUseTextPart11() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,8578");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart11/EnChrome/screenshots_termsOfUseHederTestPart11/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart11/EnChrome/screenshots_termsOfUseHederTestPart11/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart11/EnChrome/screenshots_termsOfUseHederTestPart11/difference.png");

    }
    @Test
    public void termsOfUseTextPart12() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,9446");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart12/EnChrome/screenshots_termsOfUseHederTestPart12/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart12/EnChrome/screenshots_termsOfUseHederTestPart12/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart12/EnChrome/screenshots_termsOfUseHederTestPart12/difference.png");

    }
    @Test
    public void termsOfUseTextPart13() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,9633");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart13/EnChrome/screenshots_termsOfUseHederTestPart13/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart13/EnChrome/screenshots_termsOfUseHederTestPart13/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart13/EnChrome/screenshots_termsOfUseHederTestPart13/difference.png");

    }
    @Test
    public void termsOfUseFooter() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/info/terms-of-use");

        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");

        action.clickByXpath("//div[@class=\"footer__inner\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//div[@class=\"dropdown-container language-container footer-lang-style\"]",
                "Screenshots/termsOfUseFooter/EnChrome/termsOfUseFooter/real_life_screenshot.png",
                "Screenshots/termsOfUseFooter/EnChrome/termsOfUseFooter/mock_screenshot.png",
                "Screenshots/termsOfUseFooter/EnChrome/termsOfUseFooter/difference.png");
    }

    @Test
    public void termsOfUseFooterDropDownPart1() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/info/terms-of-use");

        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");

        action.clickByXpath("//div[@data-test-id=\"lang-footer\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//div[@class=\"dropdown-container language-container footer-lang-style\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseFooterDropDownPart1/EnChrome/termsOfUseFooterDropDownPart1/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseFooterDropDownPart1/EnChrome/termsOfUseFooterDropDownPart1/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseFooterDropDownPart1/EnChrome/termsOfUseFooterDropDownPart1/difference.png");
    }

    @Test
    public void termsOfUseFooterDropDownPart2() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/info/terms-of-use");

        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");

        action.clickByXpath("//div[@data-test-id=\"lang-footer\"]");
        action.viewElementByXpath("//div[@data-test-id=\"hi\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("//div[@class=\"dropdown-container language-container footer-lang-style\"]",
                "Screenshots/termsOfUseFooterDropDownPart2/EnChrome/termsOfUseFooterDropDownPart2/real_life_screenshot.png",
                "Screenshots/termsOfUseFooterDropDownPart2/EnChrome/termsOfUseFooterDropDownPart2/mock_screenshot.png",
                "Screenshots/termsOfUseFooterDropDownPart2/EnChrome/termsOfUseFooterDropDownPart2/difference.png");
    }

}