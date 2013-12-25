package org.grible.gribletest.pages.pageobjects;

import org.grible.gribletest.core.easybselenideintegration.conditionaliases.Be;
import org.grible.gribletest.pages.pageutils.Settings;

/**
 * @author ykramarenko
 *         Date: 12/24/13
 *         Time: 6:21 PM
 */
public class HomeSettingsPage extends AuthorizedPage{

    public HomeSettingsPage(AuthorizedPage parent) {
        super(parent);
    }

    @Override
    protected void load() {
        parent.get();
        Settings.open();
    }

    @Override
    public void isLoaded() {
        Settings.container().should(Be.visible);
    }
}
