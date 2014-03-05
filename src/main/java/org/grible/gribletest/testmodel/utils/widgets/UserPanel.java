package org.grible.gribletest.testmodel.utils.widgets;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.testmodel.utils.pages.Login;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 18:17
 */
public class UserPanel {
    public static SelenideElement container() { return $("#user-panel");}

    public static SelenideElement settingsLink(){ return $("#lnk-settings a");}

    public static void doLogout(){
        container().find("#lnk-logout>a").click();
    }
    public static void doLogoutForSure(){
        doLogout();
        Login.page().isLoaded();
    }
}
