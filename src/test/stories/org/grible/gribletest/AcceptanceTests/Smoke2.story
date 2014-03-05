import com.codeborne.selenide.WebDriverRunner
import org.grible.gribletest.testmodel.utils.pages.*
import org.grible.gribletest.testmodel.utils.widgets.UserPanel
import org.grible.gribletest.tests.BaseTest

import static org.grible.gribletest.resources.TestData.TEST_PRODUCT

description "Smoke suite 2"
tags "smoke"

BaseTest.setup()

scenario "Surf Pages", {
    where "Page is #page", {
        page = [ Login.page(),
                Home.page(),
                Settings.page(),
                Login.page(Authorized.page()),
                Product.page(TEST_PRODUCT),
                Login.page(Authorized.page()),
                Settings.page(),
                Product.page(Home.page(Settings.page()), "Product_1"),
                Product.page(Product.page(TEST_PRODUCT)),
                ProductTestTables.page(TEST_PRODUCT),
                Login.page(Authorized.page()) ]
    }
    then "go to #page", { page.get() }
}
