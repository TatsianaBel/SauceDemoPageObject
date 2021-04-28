package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class InventoryContainer extends BasePage {

    public String inventoryItem = "//div[contains(text(),'%s')]/ancestor::div[@class='inventory_item']";


    private By itemBtnByProductNameBy(String productName) {
        return By.xpath(String.format(inventoryItem, productName) + "//button");
    }

    private By itemPriceByProductNameBy(String productName) {
        return By.xpath(String.format(inventoryItem, productName) + "//div[@class='inventory_item_price']");
    }

    private By itemDescByProductNameBy(String productName) {
        return By.xpath(String.format(inventoryItem, productName) + "//div[@class='inventory_item_desc']");
    }
    public InventoryContainer(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageLoaded() {
        return driver.findElement(By.cssSelector("div.product_label")).isDisplayed();
    }


    public String getActualItemDescByProductName(String productName) {
        return driver.findElement(itemDescByProductNameBy(productName)).getText();
    }

    public String getActualItemPriceByProductName(String productName) {
        return driver.findElement(itemPriceByProductNameBy(productName)).getText();
    }

    public String getBtnNameByProductName(String productName) {
        return getElementText(itemBtnByProductNameBy(productName));
    }

    public void clickBtnProductByName(String productName) {
        clickElement(itemBtnByProductNameBy(productName));
    }


    //Common methods
    public double[] getActualArrayItemsPrice() {
        List<WebElement> elements = driver.findElements(By.className("inventory_item_price"));
        double[] prices = new double[elements.size()];
        for (int i = 0; i < elements.size(); i++) {
            prices[i] = Double.parseDouble(removeCharAt(elements.get(i).getText(), 0));//удаление $ из стоимости
            //System.out.println(prices[i]);
        }
        return prices;
    }
    public String[] getActualArrayItemsDesc() {
        return getArrayOfElementText(By.className("inventory_item_desc"));
    }
    public String[] getActualArrayItemsPricesString() {
        return getArrayOfElementText(By.className("inventory_item_price"));
    }
    public List<String> getSortListNameOfProducts() {
        Collections.sort(getListNameOfProducts());
        return getListNameOfProducts();
    }

    public List<String> getListNameOfProducts() {
        List<String> strListProductName = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.className("inventory_item_name"));
        for (int i = 0; i < elements.size(); i++) {
            strListProductName.add(elements.get(i).getText());
        }
        return strListProductName;
    }



    public void sortProductOnPage(int number) {
        Select dropdown = new Select(driver.findElement(By.cssSelector("select[class=product_sort_container]")));
        dropdown.selectByIndex(number);
    }

}
