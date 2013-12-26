package stories.org.grible.gribletest.AcceptanceTests
import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be
import org.grible.gribletest.pages.pageutils.ProductTestTables
import org.grible.gribletest.resources.TestData
import org.grible.gribletest.tests.BaseTest

description "Example of failed Scenario"
tags "functional"

BaseTest.setup()

scenario "Add category button should be disabled by default", {
    given "On TablesList page",{
        ProductTestTables.page(TestData.TEST_PRODUCT).get()
    }
    then "category button should be disabled", {
        ProductTestTables.addCategoryButton().should(Be.disabled)
    }
}