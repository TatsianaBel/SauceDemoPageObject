package afterChangingTest;

import basicTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SmokeTest extends BaseTest {

    @Test
    public void buyProductTest() {
        inventoryContainer.clickBtnProductByName("Sauce Labs Bike Light");
        Assert.assertEquals(headerContainer.numProductInCart(), "1");
        cartPage = headerContainer.goToCartPage();
        Assert.assertTrue(cartPage.isPageLoaded());
        checkoutStepOnePage = cartPage.goToCheckoutStepOnePage();
        checkoutStepOnePage.enterFirstName("hhkjk");
        checkoutStepOnePage.enterLastName("fgfhg");
        checkoutStepOnePage.enterPostalCode("67gfgh");
        checkoutStepTwoPage = checkoutStepOnePage.goToCheckoutStepTwoPage();
        checkoutCompletePage = checkoutStepTwoPage.goToCheckoutCompletePage();
    }

    @Test
    public void coninueShoppingTest() {
        inventoryContainer.clickBtnProductByName("Sauce Labs Bike Light");
        Assert.assertEquals(headerContainer.numProductInCart(), "1");
        cartPage = headerContainer.goToCartPage();
        Assert.assertTrue(cartPage.isPageLoaded());
        inventoryContainer = cartPage.returnToInventoryPage();
        Assert.assertTrue(inventoryContainer.isPageLoaded());

    }
}
