package org.grible.gribletest.pages.pageobjects;

import org.grible.gribletest.core.SelenideLoadablePage;
import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.pages.pageutils.Login;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 11:42
 */



public class LoginPage extends SelenideLoadablePage {
    String baseurl;

    public LoginPage(String baseurl) {
        this.baseurl = baseurl;
    }

    @Override
    protected void load() {
        Login.open(baseurl);
    }

    @Override
    public void isLoaded(){
        Login.container().should(Be.visible);
    }
}
