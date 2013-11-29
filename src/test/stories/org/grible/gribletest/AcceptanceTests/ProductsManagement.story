package stories.org.grible.gribletest.AcceptanceTests
import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be
import org.grible.gribletest.pagesteps.Products
import static org.grible.gribletest.resources.TestData.TEST_PRODUCT
import org.grible.gribletest.widgets.Table

import static org.grible.gribletest.pagesteps.Common.cleanReLogin
import static org.grible.gribletest.widgets.Table.cellByText

description "Products test"
tags "functional"

scenario "Add new product", {
    given "On Products page",{
        Products.page().get()
    }
    and "No custom product with '" + TEST_PRODUCT + "' name exist", {
        Table.ensureHasNo(cellByText(TEST_PRODUCT))
    }
    then "new product can be added", {
        Products.addProductForSure(TEST_PRODUCT)
    }
    and "after relogin still present", {
        cleanReLogin()
        Table.cellByText(TEST_PRODUCT).should(Be.visible);
    }
}