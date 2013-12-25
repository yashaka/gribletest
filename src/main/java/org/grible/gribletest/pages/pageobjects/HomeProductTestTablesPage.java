package org.grible.gribletest.pages.pageobjects;

import org.grible.gribletest.core.SelenideLoadablePage;
import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.pages.pageutils.ProductTestTables;
import org.grible.gribletest.pages.widgets.Breadcrumb;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 14.12.13
 * Time: 20:01
 */
public class HomeProductTestTablesPage extends SelenideLoadablePage{
    private HomeProductPage parent;


    public HomeProductTestTablesPage(HomeProductPage parent){
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
