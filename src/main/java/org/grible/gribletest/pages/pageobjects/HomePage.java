package org.grible.gribletest.pages.pageobjects;

import org.grible.gribletest.core.SelenideLoadablePage;
import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.pages.pageutils.Home;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 11:39
 */
public class HomePage extends SelenideLoadablePage {
    private LoginPage parent;
    private String login;
    private String password;

    public HomePage(LoginPage parent, String login, String password) {
        this.parent = parent;
        this.login = login;
        this.password = password;
    }

    @Override
    protected void load() {
        parent.get();
        Home.open(login, password);
    }

    @Override
    public void isLoaded() {
        Home.addProductButton().should(Be.visible);
    }
}
