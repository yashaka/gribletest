package testng.org.grible.gribletest.examples;

import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.pages.pageutils.Home;
import org.grible.gribletest.pages.widgets.Table;
import org.grible.gribletest.tests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.grible.gribletest.pages.pageutils.Common.cleanReLogin;
import static org.grible.gribletest.pages.widgets.Table.cellByText;
import static org.grible.gribletest.resources.TestData.TEST_PRODUCT;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 16:47
 */
public class ProductManagement {

    @BeforeClass
    public void setup(){
        BaseTest.setup();
    }

    @Test
    public void testNewProductCanBeAdded() {
        Home.page().get();
        Table.ensureHasNo(cellByText(TEST_PRODUCT));
        Home.addProductForSure(TEST_PRODUCT);
        cleanReLogin();
        Table.cellByText(TEST_PRODUCT).should(Be.visible);
    }
}
