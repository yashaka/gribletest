package testng.org.grible.gribletest.examples;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.core.helpers.PageUtils;
import org.grible.gribletest.core.helpers.SystemHelpers;
import org.grible.gribletest.testmodel.pagegetters.AbstractPage;
import org.grible.gribletest.testmodel.utils.pages.*;
import org.grible.gribletest.testmodel.utils.widgets.Table;
import org.grible.gribletest.tests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import static org.grible.gribletest.core.helpers.PageUtils.getExpectedElements;
import static org.grible.gribletest.core.helpers.SystemHelpers.debugLog;
import static org.grible.gribletest.resources.TestData.TEST_PRODUCT;
import static org.grible.gribletest.testmodel.utils.pages.Common.cleanReLogin;
import static org.grible.gribletest.testmodel.utils.widgets.Table.cellByText;

/**
 * @author ykramarenko
 *         Date: 12/23/13
 *         Time: 10:11 PM
 */
public class SmokeTest {

    @BeforeClass
    public void setup(){
        BaseTest.setup();
    }

    @DataProvider
    public Object[][] pages() {
        return new Object[][]{

                {Login.page(),                              Login.class},
                {Home.page(),                               Home.class},
                {Settings.page(),                           Settings.class},
                {Login.page(Authorized.page()),             Login.class},
                {Product.page(TEST_PRODUCT),                Product.class},
                {Login.page(Authorized.page()),             Login.class},
                {Settings.page(),                           Settings.class},
                {Product.page(Home.page(Settings.page()),   "Product_1"), Product.class},
                {Product.page(Product.page(TEST_PRODUCT)),  Product.class},
                {ProductTestTables.page(TEST_PRODUCT),      ProductTestTables.class},
                {Login.page(Authorized.page()),             Login.class}
        };
    }

    @Test(dataProvider = "pages")
    public void testSurfPages(AbstractPage page, Class<?> pageutils) throws InvocationTargetException, IllegalAccessException {

        page.get();
        debugLog("On the page:  " + page);

        for(SelenideElement element: getExpectedElements(pageutils)){

            debugLog("\t\tVerifying element... " + element);
            element.shouldBe(Condition.visible);
        }
    }
}
