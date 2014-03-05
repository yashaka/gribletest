package org.grible.gribletest.testmodel.utils.pages;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.testmodel.pagegetters.HomePage;
import org.grible.gribletest.testmodel.pagegetters.ProductPage;
import org.grible.gribletest.testmodel.utils.widgets.Table;

import static org.grible.gribletest.testmodel.utils.widgets.Table.cellByText;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 18:33
 */
public class Product {
    public static ProductPage page(String productName){
        return page(Home.page(), productName);
    }

    public static ProductPage page(HomePage page, String productName){
        return new ProductPage(page, productName);
    }

    public static ProductPage page(ProductPage page){
        return new ProductPage(page);
    }

    public static void open(String productName) {
        Table.cellByText(productName).click();
    }

    public static SelenideElement testTableItem(){ return cellByText("Test Tables");}
}
