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

    //    @Test
    public void termsOfUseTextPart4() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart4/EnChrome/screenshots_termsOfUseHederTestPart4/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart4/EnChrome/screenshots_termsOfUseHederTestPart4/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart4/EnChrome/screenshots_termsOfUseHederTestPart4/mock_screenshot.png");

    }

    //    @Test
    public void termsOfUseTextPart5() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/difference.png");

    }

    //    @Test
    public void termsOfUseTextPart6() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/difference.png");

    }

    //    @Test
    public void termsOfUseTextPart7() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/difference.png");

    }

    //    @Test
    public void termsOfUseTextPart8() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/difference.png");

    }

    //    @Test
    public void termsOfUseTextPart9() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfect.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/real_life_screenshot.png",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/mock_screenshot.png",
                "Screenshots/termsOfUseTextPart1/EnChrome/screenshots_termsOfUseHederTestPart1/difference.png");

    }

    //    @Test
    public void test3() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/sign-up");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.hoverOverAnElementByXpath("(//span[@class=\"nav-title\"])[2]");
        pixelPerfect.byElement("//div[@class='menu-container']", "Screenshots/Create_Account_page/EnChrome/Screenshots_test3/real_life_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Screenshots_test3/mock_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Screenshots_test3/difference.png");
    }

    //    @Test
    public void test4() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/sign-up");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfect.byElement("//div[@class='auth-wrapper header-border']", "Screenshots/Create_Account_page/EnChrome/Screenshots_test4/real_life_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Screenshots_test4/mock_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Screenshots_test4/difference.png");
    }

    @Test
    public void restore_password() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/restore-password");
        action.waitElementIsVisible("//a[@data-test-id='header signup']");
        pixelPerfect.fullPage("Screenshots/Create_Account_page/EnChrome/restore_password/real_life_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/restore_password/mock_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/restore_password/difference.png");
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