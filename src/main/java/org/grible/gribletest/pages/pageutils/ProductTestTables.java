package org.grible.gribletest.pages.pageutils;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.pages.pageobjects.ProductTestTablesPage;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 20:07
 */
public class ProductTestTables {
    public static ProductTestTablesPage page(String productName){
        return new ProductTestTablesPage(Product.page(productName));
    }

    public static void open(){
        Product.testTableItem().click();
    }

    public static SelenideElement addCategoryButton() { return $("#btn-add-category");}
}
