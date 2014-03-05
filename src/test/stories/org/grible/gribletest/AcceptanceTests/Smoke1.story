import com.codeborne.selenide.WebDriverRunner
import org.grible.gribletest.testmodel.utils.pages.*
import org.grible.gribletest.testmodel.utils.widgets.UserPanel
import org.grible.gribletest.tests.BaseTest

import static org.grible.gribletest.resources.TestData.TEST_PRODUCT

description "Smoke suite"
tags "smoke"

BaseTest.setup()

scenario "Surf Pages", {
    then "Login", { Login.page().get()}
    then "Home", { Home.page().get()}
    then "Settings", { Settings.page().get()}
    then "Login", { Login.page(Authorized.page()).get() }
    then "Product", {Product.page(TEST_PRODUCT).get()}
    then "Login", { Login.page(Authorized.page()).get() }
    then "Settings", { Settings.page().get()}
    then "Product", {Product.page(Home.page(Settings.page()), "Product_1").get()}
    then "Product", {Product.page(Product.page("Product_1")).get()}
    then "Product TableList", {ProductTestTables.page(TEST_PRODUCT).get()}
    then "Login", { Login.page(Authorized.page()).get() }
}
