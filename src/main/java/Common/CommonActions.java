package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import java.time.Duration;

//import static Common.Config.PLATFORM_AND_BROWSER;

import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class CommonActions {

    public static WebDriver createDriver(String platformAndBrowser) {
        WebDriver driver = null;

        switch (platformAndBrowser) {
            case "win_chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(co);
                break;

            case "win_firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "win_edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case "mac_safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;

            default:
            Assert.fail("Incorrect platform or browser name: " + platformAndBrowser);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}
