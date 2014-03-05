package org.grible.gribletest.testmodel.utils.pages;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.testmodel.pagegetters.SettingsPage;
import org.grible.gribletest.testmodel.utils.widgets.UserPanel;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author ykramarenko
 *         Date: 12/24/13
 *         Time: 6:38 PM
 */
public class Settings {

    public static SettingsPage page(){
        return new SettingsPage(Home.page());
    }

    public static void open(){
        UserPanel.settingsLink().should(Be.visible).click();
    }

    public static SelenideElement container(){ return $("#settings-page");}
}
