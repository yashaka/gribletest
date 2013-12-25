package org.grible.gribletest.pages.pageutils;

/**
 * @author ykramarenko
 *         Date: 12/25/13
 *         Time: 3:46 AM
 */
public class Authorized {

    public static void open(String login, String password) {
        Login.doLogin(login, password);
    }
}
