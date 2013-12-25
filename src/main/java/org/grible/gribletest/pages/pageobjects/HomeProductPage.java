package org.grible.gribletest.pages.pageobjects;

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
public class HomeProductPage extends AuthorizedPage{
    protected String productName;

    public HomeProductPage(HomePage parent, String productName){
        super(parent);
        this.productName = productName;
    }

    public HomeProductPage(HomeProductPage parent){
        super(parent);
        this.productName = parent.getProductName();
    }

    @Override
    protected void load() {
        parent.get();
        if (parent instanceof HomeProductPage) {
            Breadcrumb.productLink(((HomeProductPage) parent).getProductName()).click();
        } else {
            Home.ensureHasProduct(productName);
            Product.open(productName);
        }
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
