package stories.org.grible.gribletest.AcceptanceTests

import org.grible.gribletest.pages.pageutils.ProductTestTables
import org.grible.gribletest.tests.BaseTest

import static org.grible.gribletest.resources.TestData.TEST_TABLE

description "Product Table Management"
tags "functional"

BaseTest.setup()

scenario "Add new table", {
    given "On TablesList page",{
        ProductTestTables.page().get()
    }
    and "No custom table with '" + TEST_TABLE + "' name exist"
    then "new table with '" + TEST_TABLE + "' name can be added"
    and "after relogin still present"
}