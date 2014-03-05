package org.grible.gribletest.tests;

import com.codeborne.selenide.WebDriverRunner;
import org.grible.gribletest.resources.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.grible.gribletest.core.helpers.SystemHelpers.debugLog;

/**
 * @author ykramarenko
 *         Date: 12/22/13
 *         Time: 10:27 AM
 */
public class BaseTest {
    public static void setup(String baseurl, String login, String password){
        WebDriverRunner.addListener(
                new AbstractWebDriverEventListener() {

                    public void beforeClickOn(WebElement element, WebDriver driver) {

                        debugLog("CLICKING: " + element);
                        sleep(100);
                    }


                    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
                        sleep(100);
                    }

                });

        debugLog("baseurl: " + baseurl);
        debugLog("username: " + login);
        debugLog("password: " + password);
        TestConfig.baseurl = baseurl;
        TestConfig.username = login;
        TestConfig.password = password;
    }

    public static void setup(){
        setup(System.getProperty("baseurl"), System.getProperty("username"), System.getProperty("password"));
    }
}
