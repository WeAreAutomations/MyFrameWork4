package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class Action {


    protected WebDriver driver;

    public Action(WebDriver driver){
        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }


    public WebElement findElementByXpath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        return element;
    }

    public WebElement findElementByID(String id) {
        WebElement element = driver.findElement(By.xpath(id));
        return element;
    }

    public void waitElementIsVisible(String xpath){
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).
                until(ExpectedConditions.visibilityOf(findElementByXpath(xpath)));
    }

    public void inputText(WebElement element, String text){
        element.sendKeys(text);
    }

    public void InputTextByXpath(String xpath, String text) {
        WebElement element = findElementByXpath(xpath);
        inputText(element, text);
    }

    public void InputTextByID(String id, String text) {
        WebElement element = findElementByXpath(id);
        inputText(element, text);
    }

    public void clickByXpath(String xpath){
        WebElement element = findElementByXpath(xpath);
        element.click();
    }

    public void clickByID(String id){
        WebElement element = findElementByXpath(id);
        element.click();
    }

    public void hoverOverAnElementByXpath(String xpath) {
        Actions action = new Actions(driver);
        action.moveToElement(findElementByXpath(xpath)).perform();
    }

    public void hoverOverAnElementByID(String id) {
        Actions action = new Actions(driver);
        action.moveToElement(findElementByXpath(id)).perform();
    }

    public void scrollPage(String Scroll_to_pointed_pixel) {
        // Проскролить страницу на определенное количество пикселей
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy" + "(" + Scroll_to_pointed_pixel + ")");//"window.scrollBy(0,500)"
    }
    public void viewElementByXpath(String xpath){
        WebElement element = findElementByXpath(xpath);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
