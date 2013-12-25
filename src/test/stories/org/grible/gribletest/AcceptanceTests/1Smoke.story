import org.grible.gribletest.pages.pageutils.*
import org.grible.gribletest.pages.widgets.UserPanel
import org.grible.gribletest.tests.BaseTest

import static org.grible.gribletest.resources.TestData.TEST_PRODUCT

description "Smoke suite"
tags "smoke"

BaseTest.setup()

scenario "Surf Pages", {
    then "Login", { Login.page().get()}
    then "Home", { Home.page().get()}
    then "Settings", { Settings.page().get()}
    then "do Logout", { UserPanel.doLogoutForSure()}
    then "Product", {Product.page(TEST_PRODUCT).get()}
    then "do Logout", { UserPanel.doLogoutForSure()}
    then "Settings", { Settings.page().get()}
    then "Product", {Product.page(Home.page(Settings.page()), "Product_1").get()}
    then "Product", {Product.page(Product.page("Product_1")).get()}
    then "Product TableList", {ProductTestTables.page(TEST_PRODUCT).get()}
    then "do Logout", { UserPanel.doLogoutForSure()}
}