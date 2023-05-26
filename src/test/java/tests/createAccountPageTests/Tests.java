package tests.createAccountPageTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class Tests extends BaseTest {
    public Tests() {
        super("win_chrome");
    }

    @Test
    public void Create_Account_pageHead() throws IOException, InterruptedException {

        action.openPage("https://dex-trade.com/sign-up");
        action.waitElementIsVisible("//a[@data-test-id='header signup']");
        pixelPerfect.byElement("//div[@class=\"header-wrapper\"]", "Screenshots/Create_Account_page/EnChrome/Create_Account_pageHead/real_life_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Create_Account_pageHead/mock_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Create_Account_pageHead/difference.png");


    }

    @Test
    public void Create_Account_pagePart1() throws IOException, InterruptedException {

        action.openPage("https://dex-trade.com/sign-up");
        action.waitElementIsVisible("//a[@data-test-id='header signup']");
        pixelPerfect.byElement("//div[@class=\"ds-container-fluid sign-page-container custom-sign-up-container\"]", "Screenshots/Create_Account_page/EnChrome/Create_Account_pagePart1/real_life_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Create_Account_pagePart1/mock_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Create_Account_pagePart1/difference.png");


    }

}


