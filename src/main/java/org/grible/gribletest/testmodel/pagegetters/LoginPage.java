package org.grible.gribletest.testmodel.pagegetters;

import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.testmodel.utils.pages.Authorized;
import org.grible.gribletest.testmodel.utils.pages.Login;
import org.grible.gribletest.testmodel.utils.widgets.UserPanel;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 11:42
 */



public class LoginPage extends AbstractPage {
    String baseurl;
    AuthorizedPage parent;

    public LoginPage(String baseurl) {
        this.baseurl = baseurl;
        this.parent = null;
    }

    public LoginPage(AuthorizedPage parent) {
        this.baseurl = null;
        this.parent = parent;
    }

    @Override
    protected void load() {
        if (parent == null){
            getWebDriver().manage().deleteAllCookies();
            Login.open(baseurl);
        } else if (parent instanceof AuthorizedPage){
            UserPanel.doLogout();
        }
    }

    @Override
    public void isLoaded(){
        Login.container().should(Be.visible);
    }
}
