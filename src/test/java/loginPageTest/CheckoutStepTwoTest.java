package loginPageTest;

import basicTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutStepTwoTest extends BaseTest {
    @Test
    public void checkPaymentInformationTest() {
        inventoryContainer.clickBtnProductByName("Sauce Labs Bike Light");
        inventoryContainer.clickBtnProductByName("Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(headerContainer.numProductInCart(), 2);
        cartPage = headerContainer.goToCartPage();
        Assert.assertTrue(cartPage.isPageLoaded());
        checkoutStepOnePage = cartPage.goToCheckoutStepOnePage();
        checkoutStepOnePage.enterFirstName("hhkjk");
        checkoutStepOnePage.enterLastName("fgfhg");
        checkoutStepOnePage.enterPostalCode("67gfgh");
        checkoutStepTwoPage = checkoutStepOnePage.goToCheckoutStepTwoPage();
        //Assert.assertEquals(checkoutStepTwoPage.getItemTotal(), checkoutStepTwoPage.getSumOfProducts());
    }
}
