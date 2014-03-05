package org.grible.gribletest.testmodel.pagegetters;

import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.testmodel.utils.pages.Home;
import org.grible.gribletest.testmodel.utils.pages.Product;
import org.grible.gribletest.testmodel.utils.widgets.Breadcrumb;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 18:18
 */
public class ProductPage extends AuthorizedPage{
    protected String productName;

    public ProductPage(HomePage parent, String productName){
        super(parent);
        this.productName = productName;
    }

    public ProductPage(ProductPage parent){
        super(parent);
        this.productName = parent.getProductName();
    }

    @Override
    protected void load() {
        parent.get();
        if (parent instanceof ProductPage) {
            Breadcrumb.productLink(((ProductPage) parent).getProductName()).click();
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
