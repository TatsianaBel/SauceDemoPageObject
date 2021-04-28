package loginPageTest;

import basicTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class InventoryTest extends BaseTest {

    @Test
    public void corresponding_Actual_And_Expected_Inventory_Item_Name() {
        Assert.assertEquals(inventoryContainer.getSortListNameOfProducts(), productData.getSortFromAtoZExpectedListNameOfProducts());
    }

    @Test
    public void corresponding_Actual_And_Expected_Item_Description() {
        List<String> actualDescr = new ArrayList<>();
        int arraySize = inventoryContainer.getActualArrayItemsDesc().length;
        for (int i = 0; i < arraySize; i++) {
            String description = productData.getExpectedListNameOfProducts().get(i);
            actualDescr.add(inventoryContainer.getActualItemDescByProductName(description));
        }
        Assert.assertEquals(actualDescr, productData.getExpectedListDescrOfProducts());
    }

    @Test
    public void corresponding_Actual_And_Expected_Item_Price() {
        List<String> actualPrice = new ArrayList<>();
        int arraySize = inventoryContainer.getActualArrayItemsDesc().length;
        for (int i = 0; i < arraySize; i++) {
            String description = productData.getExpectedListNameOfProducts().get(i);
            actualPrice.add(inventoryContainer.getActualItemPriceByProductName(description));
        }
        Assert.assertEquals(actualPrice, productData.getExpectedListPriceOfProducts());
    }

    @Test
    public void increase_Cart_Badge_After_Add_Product_To_Cart() {
        for (int i = 0; i < productData.getExpectedListNameOfProducts().size(); i++) {
            String namefProduct = productData.getExpectedListNameOfProducts().get(i);
            int countInCart = headerContainer.numProductInCart();
            String btnName = inventoryContainer.getBtnNameByProductName(namefProduct);
            Assert.assertEquals(btnName, "ADD TO CART");
            inventoryContainer.clickBtnProductByName(namefProduct);
            Assert.assertEquals(headerContainer.numProductInCart(), countInCart + 1);
        }
    }

    @Test
    public void decrease_Cart_Badge_After_Delete_Products_From_Cart() {
        for (int i = 0; i < productData.getExpectedListNameOfProducts().size(); i++) {
            String expectedNameofProduct = productData.getExpectedListNameOfProducts().get(i);
            String actualBtnName = inventoryContainer.getBtnNameByProductName(expectedNameofProduct);
            Assert.assertEquals(actualBtnName, "ADD TO CART");
            int actualCountInCart = headerContainer.numProductInCart();
            inventoryContainer.clickBtnProductByName(expectedNameofProduct);
            Assert.assertEquals(headerContainer.numProductInCart(), actualCountInCart + 1);
            actualBtnName = inventoryContainer.getBtnNameByProductName(expectedNameofProduct);
            Assert.assertEquals(actualBtnName, "REMOVE");
            actualCountInCart = headerContainer.numProductInCart();
            inventoryContainer.clickBtnProductByName(expectedNameofProduct);
            Assert.assertEquals(headerContainer.numProductInCart(), actualCountInCart - 1);
        }
    }

    @Test
    public void sortProductsTest() {
        SoftAssert softAssert = new SoftAssert();
        inventoryContainer.sortProductOnPage(0);
        softAssert.assertEquals(inventoryContainer.getListNameOfProducts(), productData.getSortFromAtoZExpectedListNameOfProducts(), "Сортировка от A to Z неверная");
        inventoryContainer.sortProductOnPage(1);
        softAssert.assertEquals(inventoryContainer.getListNameOfProducts(), productData.getSortFromZtoAExpectedListNameOfProducts(), "Сортировка от Z to A неверная");
        inventoryContainer.sortProductOnPage(2);
        softAssert.assertTrue(inventoryContainer.isSortedFromLowToHigh(inventoryContainer.getActualArrayItemsPrice()), "Сортировка цены по возрастанию неверная");
        inventoryContainer.sortProductOnPage(3);
        softAssert.assertTrue(inventoryContainer.isSortedFromHighToLow(inventoryContainer.getActualArrayItemsPrice()), "Сортировка цены по убыванию неверная");
        softAssert.assertAll();
    }

}
