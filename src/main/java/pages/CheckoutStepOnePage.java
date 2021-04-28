package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepOnePage extends BasePage {
    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);

    }

    @Override
    boolean isPageLoaded() {
        boolean elementPresent = driver.findElement(By.cssSelector("div.subheader")).getText().contains("Checkout: Your Information");
        if (elementPresent) {
            return true;
        } else return false;
    }

    public void enterFirstName(String firstName) {
        sendText(By.id("first-name"), firstName);
    }

    public void enterLastName(String lastName) {
        sendText(By.id("last-name"), lastName);
    }

    public void enterPostalCode(String postalCode) {
        sendText(By.id("postal-code"), postalCode);
    }

    public CheckoutStepTwoPage goToCheckoutStepTwoPage() {
        clickElement(By.cssSelector("[type=submit]"));
        return new CheckoutStepTwoPage(driver);
    }

}
