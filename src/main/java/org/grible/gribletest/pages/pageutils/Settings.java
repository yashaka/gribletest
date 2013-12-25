package org.grible.gribletest.pages.pageutils;

import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.pages.pageobjects.HomeSettingsPage;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author ykramarenko
 *         Date: 12/24/13
 *         Time: 6:38 PM
 */
public class Settings {

    public static HomeSettingsPage page(){
        return new HomeSettingsPage(Home.page());
    }

    public static SelenideElement container(){ return $("#settings-page");}
}
