package org.grible.gribletest.pages.alternatives;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author ykramarenko
 *         Date: 12/24/13
 *         Time: 8:38 PM
 */
public class LoginSelenidePageObject {

    private final String CONTAINER = "#login-form";
    private final By USERNAME = By.name("username");
    private final By PASSWORD = By.name("username");

    private final String LOGIN_BTN = ".ui-button[value='Log in']";

    public void open(String baseurl) {
        open(baseurl);
    }

    public void doLogin(String login, String password){
        $(USERNAME).setValue(login);
        $(PASSWORD).sendKeys(password);
        $(LOGIN_BTN).click();
    }

    public LoginSelenidePageObject(String username, String password, String baseurl) {
        this.username = username;
        this.password = password;
        this.baseurl = baseurl;
    }

    private String username;
    private String password;
    private String baseurl;

    private WebDriver driver;
}
