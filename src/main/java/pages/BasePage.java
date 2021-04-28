package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BasePage {
    protected WebDriver driver;
    public static final String BASE_URL = "https://www.saucedemo.com";
    public static final String LOGIN_URL = BASE_URL + "/";
    Actions action;
    JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    abstract boolean isPageLoaded();

    protected String getPageUrl() {
        return driver.getCurrentUrl();
    }

    protected void clickElement(By element) {
        scrollToElemenView(element);
        driver.findElement(element).click();
    }

    protected void moveToElement(By element) {
        action = new Actions(driver);
        action.moveToElement(driver.findElement(element)).perform();
    }

    protected void scrollToElemenView(By element) {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(element));
    }

    protected void sendText(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    protected void openPage(String url) {
        driver.get(url);
    }

    protected String getElementText(By element) {
        return driver.findElement(element).getText();
    }
    //

    public String[] getArrayOfElementText(By element) {
        List<WebElement> elements = driver.findElements(element);
        String[] textsArray = new String[elements.size()];
        for (int i = 0; i < elements.size(); i++) {
            textsArray[i] = elements.get(i).getText();
        }
        return textsArray;
    }
    public static boolean isSortedFromLowToHigh(double[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i - 1] > data[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedFromHighToLow(double[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i - 1] < data[i]) {
                return false;
            }
        }
        return true;
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    public static String deleteSomeCharacters(String str, int from, int count) {
        return str.substring(0, from) + str.substring(from + count);
    }

    public boolean isElementExists(By by) {
        boolean isExists = true;
        try {
            driver.findElement(by);
        } catch (NoSuchElementException e) {
            isExists = false;
        }
        return isExists;
    }


}
