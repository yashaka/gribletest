package org.grible.gribletest.alternative.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author ykramarenko
 *         Date: 12/24/13
 *         Time: 8:38 PM
 */
public class LoginSelenidePageObject {

    private final String CONTAINER = "#login-form";
    private final By USERNAME = By.name("username");
    private final By PASSWORD = By.name("password");
    private final String LOGIN_BTN = ".ui-button[value='Log in']";

    public SelenideElement getContainer(){
        return $(CONTAINER);
    }

    public void open(String baseurl) {
        open(baseurl);
    }

    public void doLogin(String login, String password){
        $(USERNAME).setValue(login);
        $(PASSWORD).sendKeys(password);
        $(LOGIN_BTN).click();
    }

    public LoginSelenidePageObject(String baseurl) {
        this.baseurl = baseurl;
    }

    private String baseurl;
}
