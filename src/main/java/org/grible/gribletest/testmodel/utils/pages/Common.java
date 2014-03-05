package org.grible.gribletest.testmodel.utils.pages;

import org.grible.gribletest.testmodel.utils.widgets.UserPanel;

import static org.grible.gribletest.core.helpers.SelenideHelpers.cleanCookies;
import static org.grible.gribletest.core.helpers.SelenideHelpers.pressF5;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 19:02
 */
public class Common {

    public static void cleanReLogin(){
        UserPanel.doLogout();
        cleanCookies();
        Home.page().get();
    }

    public static void cleanLogin(){
        cleanCookies();
        pressF5();
        Home.page().get();
    }
}
