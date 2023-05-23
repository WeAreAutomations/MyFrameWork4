package tests.Login_page_tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class Tests extends BaseTest {
    public Tests() {
        super("win_chrome");
    }


    @Test
    public void loginHederTest() throws IOException, InterruptedException {

        action.openPage("https://dex-trade.com/login");
        action.waitElementIsVisible("//a[@data-test-id='header signup']");
        pixelPerfect.byElement("//div[@class=\"header-wrapper\"]", "Screenshots/loginPage/EnChrome/screenshots_loginHederTest/real_life_screenshot.png",
                "Screenshots/loginPage/EnChrome/screenshots_loginHederTest/mock_screenshot.png",
                "Screenshots/loginPage/EnChrome/screenshots_loginHederTest/difference.png");


    }

}

