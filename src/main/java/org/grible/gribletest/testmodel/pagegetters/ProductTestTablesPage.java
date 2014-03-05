package org.grible.gribletest.testmodel.pagegetters;

import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.testmodel.utils.pages.ProductTestTables;
import org.grible.gribletest.testmodel.utils.widgets.Breadcrumb;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 20:01
 */
public class ProductTestTablesPage extends AbstractPage {
    private ProductPage parent;


    public ProductTestTablesPage(ProductPage parent){
        this.parent = parent;
    }

    @Override
    protected void load() {
        parent.get();
        ProductTestTables.open();
    }

    @Override
    public void isLoaded() {
        Breadcrumb.productLink(parent.getProductName()).should(Be.visible);
        ProductTestTables.addCategoryButton().should(Be.visible);
    }
}
