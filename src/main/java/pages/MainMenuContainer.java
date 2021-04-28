package pages;

import org.openqa.selenium.WebDriver;

public class MainMenuContainer extends BasePage{
    public MainMenuContainer(WebDriver driver) {
        super(driver);
    }

    @Override
    boolean isPageLoaded() {
        return false;
    }
}
