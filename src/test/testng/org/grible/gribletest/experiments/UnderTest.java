package testng.org.grible.gribletest.experiments;

import org.grible.gribletest.pages.pageutils.Home;
import org.grible.gribletest.pages.pageutils.Login;
import org.grible.gribletest.pages.pageutils.Settings;
import org.grible.gribletest.tests.BaseTest;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 20:32
 */
public class UnderTest {

    @Test
    public void test(){
        BaseTest.setup();
        Login.page().get();
        Home.page().get();
        Settings.page().get();
//        Home.page().get();
//        ProductsList.page().get();
//        Product.page("Product_1").get();
//        ProductTestTables.page("Product_1").get();
    }
}
