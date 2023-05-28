package tests.createAccountPageTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class Tests extends BaseTest {
    public Tests() {
        super("win_firefox");
    }

    @Test
    public void test1() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/sign-up");

        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");

        //Input a text into the selected element
        action.InputTextByXpath("//input[@type='email']", "yanautomte.st.6@gmail.com");

        //Input a text to the next element
        action.InputTextByXpath("//input[@type='password']", "Vinnitsa-2022");

        //Perform a click on the element
        action.clickByXpath("//button[@data-test-id='viewBox']");

        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("(//div[@class='auth-container'])[3]",
                "Screenshots/Create_Account_page/EnChrome/Screenshots_test1/real_life_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Screenshots_test1/mock_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Screenshots_test1/difference.png", "FULL HD");
    }

    @Test
    public void test2() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/sign-up");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfect.fullPage("Screenshots/Create_Account_page/EnChrome/Screenshots_test2/real_life_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Screenshots_test2/mock_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Screenshots_test2/difference.png",
                "FULL HD");
//        pixelPerfect.Assert(0.005);
    }

    @Test
    public void test3() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.clickByXpath("//div[@data-test-id='lang-footer']");
        action.viewElementByXpath("//div[@data-test-id=\"hi\"]");

        Thread.sleep(60000);
//        pixelPerfect.byElement("//div[@class='menu-container']", "Screenshots/Create_Account_page/EnChrome/Screenshots_test3/real_life_screenshot.png",
//                "Screenshots/Create_Account_page/EnChrome/Screenshots_test3/mock_screenshot.png",
//                "Screenshots/Create_Account_page/EnChrome/Screenshots_test3/difference.png");
    }

//    @Test
//    public void test4() throws IOException, InterruptedException {
//        action.openPage("https://dex-trade.com/sign-up");
//        action.waitElementIsVisible("//a[@data-test-id='header login']");
//        pixelPerfect.byElement("//div[@class='auth-wrapper header-border']", "Screenshots/Create_Account_page/EnChrome/Screenshots_test4/real_life_screenshot.png",
//                "Screenshots/Create_Account_page/EnChrome/Screenshots_test4/mock_screenshot.png",
//                "Screenshots/Create_Account_page/EnChrome/Screenshots_test4/difference.png");
//    }


}

