package org.grible.gribletest.pages.pageobjects;

import org.grible.gribletest.core.SelenideLoadablePage;
import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.pages.pageutils.Home;
import org.grible.gribletest.pages.pageutils.Product;
import org.grible.gribletest.pages.widgets.Breadcrumb;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 18:18
 */
public class ProductPage extends SelenideLoadablePage{
    private HomePage parent;
    protected String productName;

    public ProductPage(HomePage parent, String productName){
        this.parent = parent;
        this.productName = productName;
    }

    @Override
    protected void load() {
        parent.get();
        Home.ensureHasProduct(productName);
        Product.open(productName);
    }

    @Override
    public void isLoaded() {
        Breadcrumb.productLink(productName).should(Be.visible);
        Product.testTableItem().should(Be.visible);
    }

    public String getProductName(){
        return productName;
    }
}
