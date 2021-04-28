package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public static final String CART_ITEM = "//div[contains(text(),'%s')]/ancestor::div[@class='cart_item']//'%s']";
    public CartPage(WebDriver driver) {
        super(driver);

    }
    private By itemButtonByProductName(String productName) {
        return By.xpath(String.format(CART_ITEM, productName,"button"));
    }
    private By itemPriceByProductName(String productName) {
        return By.xpath(String.format(CART_ITEM, productName,"div[@class='inventory_item_price']"));
    }

    @Override
    public boolean isPageLoaded() {
        boolean elementPresent = driver.findElement(By.cssSelector("div.header_secondary_container")).getText().contains("YOUR CART");
        if (elementPresent) {
            return true;
        } else return false;
    }
    public void deleteProductFromCartByProductName(String productName) {
        clickElement(itemButtonByProductName(productName));
    }

    public CheckoutStepOnePage goToCheckoutStepOnePage() {
        clickElement(By.cssSelector("[class$='checkout_button']"));
        return new CheckoutStepOnePage(driver);
    }
    public InventoryContainer returnToInventoryPage() {
        clickElement(By.linkText("Continue Shopping"));
        return new InventoryContainer(driver);
    }

}
