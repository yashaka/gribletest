package stories.org.grible.gribletest.AcceptanceTests

import com.codeborne.selenide.WebDriverRunner
import org.grible.gribletest.testmodel.utils.pages.ProductTestTables
import org.grible.gribletest.tests.BaseTest

import static org.grible.gribletest.resources.TestData.TEST_PRODUCT
import static org.grible.gribletest.resources.TestData.TEST_TABLE

description "Product Table Management"
tags "functional"

BaseTest.setup()

scenario "Add new table", {
    given "On TablesList page",{
        ProductTestTables.page(TEST_PRODUCT).get()
    }
    and "No custom table with '" + TEST_TABLE + "' name exist"
    then "new table with '" + TEST_TABLE + "' name can be added"
    and "after relogin still present"
}