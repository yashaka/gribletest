package org.grible.gribletest.pages.pageutils;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.pages.pageobjects.HomePage;
import org.grible.gribletest.pages.pageobjects.ProductPage;
import org.grible.gribletest.pages.widgets.Table;

import static org.grible.gribletest.pages.widgets.Table.cellByText;

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
