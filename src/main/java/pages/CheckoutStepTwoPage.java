package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckoutStepTwoPage extends BasePage {
    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);

    }

    @Override
    boolean isPageLoaded() {
        boolean elementPresent = driver.findElement(By.cssSelector("div.subheader")).getText().contains("Checkout: Overview");
        if (elementPresent) {
            return true;
        } else return false;
    }

    public CheckoutCompletePage goToCheckoutCompletePage() {
        clickElement(By.linkText("FINISH"));
        return new CheckoutCompletePage(driver);
    }

    /*public double getSumOfProducts() {
        double sum = 0;
        for (int i = 0; i < getArrayPriceOfProducts().length; i++) {
            sum += getArrayPriceOfProducts()[i];
        }
        return sum;
    }*/

    public double getItemTotal() {
        String itemTotal = deleteSomeCharacters(getElementText(By.cssSelector("div.summary_subtotal_label")), 0, 13);
        double itemTotalDouble = Double.parseDouble(itemTotal);
        return itemTotalDouble;
    }
}
