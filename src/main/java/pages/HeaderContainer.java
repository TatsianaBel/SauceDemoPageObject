package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderContainer extends BasePage {

    public static final By NUMBER_OF_GOODS_IN_CART_BY = By.cssSelector("#shopping_cart_container span");
    public static final By ICON_CART = By.cssSelector("#shopping_cart_container");

    public HeaderContainer(WebDriver driver) {
        super(driver);
    }

    @Override
    boolean isPageLoaded() {
        return false;
    }


    public int numProductInCart() {
        if (isElementExists(NUMBER_OF_GOODS_IN_CART_BY)) {
            return Integer.parseInt(getElementText(NUMBER_OF_GOODS_IN_CART_BY));
        } else return 0;
    }


    public MainMenuContainer goMainMenuContainer() {
        clickElement(ICON_CART);
        return new MainMenuContainer(driver);
    }

    public CartPage goToCartPage() {
        clickElement(ICON_CART);
        return new CartPage(driver);
    }
}
