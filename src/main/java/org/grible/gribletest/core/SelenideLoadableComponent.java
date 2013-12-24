package org.grible.gribletest.core;

import com.codeborne.selenide.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 10:34
 */


public abstract class SelenideLoadableComponent {

    public void get() {
        long originalTimeout = Configuration.timeout;
        try {
            Configuration.timeout = 0;
            isLoaded();
            Configuration.timeout = originalTimeout;
        } catch (Error e) {
            Configuration.timeout = originalTimeout;
            load();
            isLoaded();
        }
    }

    protected abstract void load();

    protected abstract void isLoaded();
}