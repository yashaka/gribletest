package org.grible.gribletest.pages.pageobjects;

import org.grible.gribletest.core.SelenideLoadablePage;
import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.pages.pageutils.Settings;
import org.grible.gribletest.pages.widgets.UserPanel;

/**
 * @author ykramarenko
 *         Date: 12/24/13
 *         Time: 6:21 PM
 */
public class HomeSettingsPage extends SelenideLoadablePage {
    /**
     * actually any page except LoginPage can be a parent: TODO: refactor
     */
    private HomePage parent;

    public HomeSettingsPage(HomePage parent) {
        this.parent = parent;
    }

    @Override
    protected void load() {
        parent.get();
        UserPanel.settingsLink().should(Be.visible).click();
    }

    @Override
    public void isLoaded() {
        Settings.container().should(Be.visible);
    }
}
