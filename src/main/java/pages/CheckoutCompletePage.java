package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends BasePage {
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);

    }

    @Override
    boolean isPageLoaded() {
        boolean elementPresent = driver.findElement(By.cssSelector("div.subheader")).getText().contains("Finish");
        if (elementPresent) {
            return true;
        } else return false;
    }
    public void clickFinish() {
        clickElement(By.linkText("FINISH"));
    }
    public String completeText() {
        return getElementText(By.cssSelector("div.complete-text"));
    }
}
