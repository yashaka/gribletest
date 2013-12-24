package org.grible.gribletest.tests;

import org.grible.gribletest.resources.TestConfig;

import static org.grible.gribletest.core.helpers.SystemHelpers.debugLog;

/**
 * @author ykramarenko
 *         Date: 12/22/13
 *         Time: 10:27 AM
 */
public class BaseTest {
    public static void setup(String baseurl, String login, String password){
        debugLog("baseurl: " + baseurl);
        debugLog("login: " + login);
        debugLog("password: " + password);
        TestConfig.baseurl = baseurl;
        TestConfig.login = login;
        TestConfig.password = password;
    }

    public static void setup(){
        setup(System.getProperty("baseurl"), System.getProperty("login"), System.getProperty("password"));
    }
}
