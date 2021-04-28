package loginPageTest;

import basicTest.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    @Description(value = "Тест проверяет авторизацию с валидными кредами")
    public void correctAutoriz() {
        loginPage.enterUsernameAndPassword("standard_user", "secret_sauce")
                .validLogin();
        //Assert.assertTrue(inventoryContainer.isPageLoaded());
    }

    @DataProvider(name = "data-username-password")
    public Object[][] dataProviderForInvalidLogin() {
        return new Object[][]{
                {"1111", "", "Epic sadface: Password is required"},
                {"", "5565656", "Epic sadface: Username is required"},
                {"locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out."}
        };
    }

    @Test(dataProvider = "data-username-password")
    @Description(value = "Тест проверяет авторизацию с невалидными кредами")
    public void incorrectAutoriz(String username, String password, String errorMsgExpected) {
        loginPage.enterUsernameAndPassword(username, password)
                .invalidLogin();
        Assert.assertEquals(loginPage.getActualErrorMessage(), errorMsgExpected);
    }
}
