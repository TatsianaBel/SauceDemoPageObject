package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.tagName("h3");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageLoaded() {
        boolean elementPresent = driver.findElement(loginButton).isDisplayed();
        if (elementPresent) {
            return true;
        } else return false;
    }
    @Step ("Ввод username")
    public LoginPage setUsername(String username) {
        sendText(usernameField, username);
        return this;
    }
    @Step
    public LoginPage setPassword(String password) {
        sendText(passwordField, password);
        return this;

    }
    public String getActualErrorMessage() {
        return getElementText(errorMessage);
    }

    public LoginPage enterUsernameAndPassword(String username, String password) {
        openPage(LOGIN_URL);
        setUsername(username);
        setPassword(password);
        return this;
    }

    public InventoryContainer validLogin() {
        clickElement(loginButton);
        return new InventoryContainer(driver);
    }


    public LoginPage invalidLogin() {
        clickElement(loginButton);
        return this;
    }
}
