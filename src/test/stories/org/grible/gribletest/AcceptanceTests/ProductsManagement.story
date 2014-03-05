package stories.org.grible.gribletest.AcceptanceTests

import com.codeborne.selenide.WebDriverRunner
import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be
import org.grible.gribletest.testmodel.utils.pages.Home
import org.grible.gribletest.testmodel.utils.widgets.Table
import org.grible.gribletest.tests.BaseTest

import static org.grible.gribletest.testmodel.utils.pages.Common.cleanReLogin
import static org.grible.gribletest.testmodel.utils.widgets.Table.cellByText
import static org.grible.gribletest.resources.TestData.TEST_PRODUCT

description "ProductsList test"
tags "functional"

BaseTest.setup()

scenario "Add new product", {
    given "On ProductsList page",{
        Home.page().get()
    }
    and "No custom product with '" + TEST_PRODUCT + "' name exist", {
        Table.ensureHasNo(cellByText(TEST_PRODUCT))
    }
    then "new product with '" + TEST_PRODUCT + "' name can be added", {
        Home.addProductForSure(TEST_PRODUCT)
    }
    and "after relogin still present", {
        cleanReLogin()
        Table.cellByText(TEST_PRODUCT).should(Be.visible);
    }
}
