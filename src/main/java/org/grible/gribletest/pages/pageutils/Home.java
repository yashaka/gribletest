package org.grible.gribletest.pages.pageutils;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.pages.pageobjects.HomePage;
import org.grible.gribletest.resources.TestConfig;
import org.grible.gribletest.pages.widgets.Dialog;
import org.grible.gribletest.pages.widgets.Table;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

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

    public static void open(String login, String password) {
        Login.doLogin(login, password);
    }

    public static SelenideElement addProductButton() { return $("#btn-add-product");}

    public static void addProductForSure(String text){
        addProductButton().click();
        Dialog.editBox().setValue(text);
        Dialog.addButton().click();
        Table.cellByText(text).should(appear);
    }

    public static void ensureHasProduct(String productName){
        if (!Table.cellByText(productName).exists()){
            addProductForSure(productName);
        }
    }
}

