package org.grible.gribletest.pages.pageobjects;

import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.pages.pageutils.Home;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 11:39
 */
public class HomePage extends AuthorizedPage{

    public HomePage(LoginPage parent, String login, String password) {
        super(parent, login, password);
    }

    public HomePage(AuthorizedPage parent){
        super(parent);
    }

    @Override
    public void load(){
        if (parent instanceof AuthorizedPage){
            parent.get();
            Home.open();
        } else {
            super.load();
        }
    }

    @Override
    public void isLoaded() {
        super.isLoaded();
        Home.addProductButton().should(Be.visible);
    }
}
