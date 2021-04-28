import basicTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderContainerTest extends BaseTest {

    @Test
    public void openMenuSidebar(){
        headerContainer.goMainMenuContainer();
    }

    @Test
    public void empty_Shopping_Cart_Badge_Counter_After_Clean_Cookies(){
        Assert.assertEquals(headerContainer.numProductInCart(),0);
    }


}
