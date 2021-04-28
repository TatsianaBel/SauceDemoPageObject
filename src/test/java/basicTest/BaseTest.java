package basicTest;

import dataExpected.ProductData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.*;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected InventoryContainer inventoryContainer;
    protected CartPage cartPage;
    protected CheckoutStepOnePage checkoutStepOnePage;
    protected CheckoutStepTwoPage checkoutStepTwoPage;
    protected CheckoutCompletePage checkoutCompletePage;
    protected HeaderContainer headerContainer;
    protected ProductData productData;


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/tanik/Рабочий стол/Webdriver/chromedriver-linux-88");
        driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        loginPage = new LoginPage(driver);
        headerContainer = new HeaderContainer(driver);
        productData = new ProductData();
        loginPage.enterUsernameAndPassword("standard_user", "secret_sauce");
        inventoryContainer = loginPage.validLogin();
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
