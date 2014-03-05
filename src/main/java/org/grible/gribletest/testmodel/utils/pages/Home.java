package org.grible.gribletest.testmodel.utils.pages;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.core.helpers.SelenideHelpers;
import org.grible.gribletest.testmodel.pagegetters.AuthorizedPage;
import org.grible.gribletest.testmodel.pagegetters.HomePage;
import org.grible.gribletest.testmodel.utils.widgets.Breadcrumb;
import org.grible.gribletest.resources.TestConfig;
import org.grible.gribletest.testmodel.utils.widgets.Dialog;
import org.grible.gribletest.testmodel.utils.widgets.Table;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;
import static org.grible.gribletest.core.helpers.SelenideHelpers.cleanAndSendAndTab;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 12:52
 */

public class Home {
    public static HomePage page(){
        return page(TestConfig.username, TestConfig.password);
    }
    public static HomePage page(String login, String password){
        return new HomePage(Login.page(), login, password);
    }
    public static HomePage page(AuthorizedPage page){
        return new HomePage(page);
    }

    public static void open() {
        Breadcrumb.homeLink().should(Be.visible).click();
    }

    public static SelenideElement addProductButton() { return $("#btn-add-product");}

    public static void addProductForSure(String text){
        addProductButton().click();
        Dialog.editBox().setValue(text);
//        cleanAndSendAndTab(Dialog.editBox(),text);
        Dialog.addButton().click();
        Table.cellByText(text).should(appear);
    }

    public static void ensureHasProduct(String productName){
        if (!Table.cellByText(productName).exists()){
            addProductForSure(productName);
        }
    }
}

