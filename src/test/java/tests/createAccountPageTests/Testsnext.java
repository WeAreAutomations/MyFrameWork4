package tests.createAccountPageTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class Testsnext extends BaseTest {

    public Testsnext() {
        super("win_chrome");
    }
    @Test
public void stakingFullPageNonAuth() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/staking");
        action.waitElementIsVisible("//a[@data-test-id='header signup']");
        pixelPerfect.fullPage("Screenshots/Create_Account_page/EnChrome/stakingFullPageNonAuth/real_life_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/stakingFullPageNonAuth/mock_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/stakingFullPageNonAuth/difference.png");

    }




}

