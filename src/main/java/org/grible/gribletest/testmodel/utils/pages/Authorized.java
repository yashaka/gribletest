package org.grible.gribletest.testmodel.utils.pages;

import org.grible.gribletest.resources.TestConfig;
import org.grible.gribletest.testmodel.pagegetters.AuthorizedPage;
import org.grible.gribletest.testmodel.pagegetters.AuthorizedPage;

/**
 * @author ykramarenko
 *         Date: 12/25/13
 *         Time: 3:46 AM
 */
public class Authorized {
    public static AuthorizedPage page(){
        return page(TestConfig.username, TestConfig.password);
    }
    public static AuthorizedPage page(String login, String password){
        return new AuthorizedPage(Login.page(), login, password);
    }
    public static AuthorizedPage page(AuthorizedPage page){
        return new AuthorizedPage(page);
    }

    public static void open(String login, String password) {
        Login.doLogin(login, password);
    }
}
