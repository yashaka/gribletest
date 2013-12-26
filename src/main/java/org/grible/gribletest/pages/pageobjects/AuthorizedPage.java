package org.grible.gribletest.pages.pageobjects;

import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.pages.pageutils.Login;
import org.grible.gribletest.pages.widgets.Breadcrumb;
import org.grible.gribletest.pages.widgets.UserPanel;

/**
 * @author ykramarenko
 *         Date: 12/25/13
 *         Time: 3:27 AM
 */
public class AuthorizedPage extends AbstractPage {
    protected AbstractPage parent;
    private String username;
    private String password;

    public AuthorizedPage(LoginPage parent, String username, String password) {
        this.parent = parent;
        this.username = username;
        this.password = password;
    }

    public AuthorizedPage(AuthorizedPage parent){
        this.parent = parent;
    }

    @Override
    protected void load() {
        if (parent instanceof LoginPage) {
            parent.get();
            Login.doLogin(username, password);
        }
    }

    @Override
    public void isLoaded() {
        Breadcrumb.container().should(Be.visible);
        UserPanel.container().should(Be.visible);
    }
}
