package testng.org.grible.gribletest.examples;

import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.resources.TestData;
import org.grible.gribletest.testmodel.utils.pages.Home;
import org.grible.gribletest.testmodel.utils.pages.ProductTestTables;
import org.grible.gribletest.testmodel.utils.widgets.Table;
import org.grible.gribletest.tests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.grible.gribletest.resources.TestData.TEST_PRODUCT;
import static org.grible.gribletest.testmodel.utils.pages.Common.cleanReLogin;
import static org.grible.gribletest.testmodel.utils.widgets.Table.cellByText;

/**
 * Created with IntelliJ IDEA.
 * User: ayia
 * Date: 28.02.14
 * Time: 12:33
 */
public class ProductTestTablesTest {

    @BeforeClass
    public void setup(){
        BaseTest.setup();
    }

    @Test
    public void testAddCategoryButtonShouldBeDisabledByDefault() {
        ProductTestTables.page(TestData.TEST_PRODUCT).get();
        ProductTestTables.addCategoryButton().should(Be.disabled);
    }
}
