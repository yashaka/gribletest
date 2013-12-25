package testng.org.grible.gribletest.experiments;

import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.pages.pageobjects.HomePage;
import org.grible.gribletest.pages.pageobjects.HomeProductPage;
import org.grible.gribletest.pages.pageobjects.HomeProductTestTablesPage;
import org.grible.gribletest.pages.pageobjects.LoginPage;
import org.grible.gribletest.pages.pageutils.Home;
import org.grible.gribletest.pages.pageutils.Login;
import org.grible.gribletest.pages.pageutils.Product;
import org.grible.gribletest.pages.pageutils.ProductTestTables;
import org.grible.gribletest.tests.BaseTest;
import org.testng.annotations.Test;

import static org.grible.gribletest.resources.TestConfig.*;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 20:32
 * To change this template use File | Settings | File Templates.
 */
public class UnderTest {

    @Test
    public void test(){
        BaseTest.setup();
//        ProductsList.page().get();
        Product.page("Product_1").get();
        ProductTestTables.page("Product_1").get();
    }

    @Test
    public void test2(){
        Login.open(baseurl);
        Home.open(username, password);
        Home.ensureHasProduct("Product_1");
        Product.open("Product_1");
        ProductTestTables.open();
        ProductTestTables.addCategoryButton().should(Be.visible);

        (new HomeProductTestTablesPage(
                new HomeProductPage(
                        new HomePage(new LoginPage(baseurl), username, password),
                        "Product_1"))).get();

        ProductTestTables.page("Product_1").get();

    }
}
