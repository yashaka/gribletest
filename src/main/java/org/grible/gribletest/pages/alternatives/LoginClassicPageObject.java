package org.grible.gribletest.pages.alternatives;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author ykramarenko
 *         Date: 12/24/13
 *         Time: 8:18 PM
 */
public class LoginClassicPageObject {

    @FindBy(css = "#login-form")
    private WebElement container;

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(css = ".ui-button[value='Log in']")
    private WebElement loginButton;

    public void open(String baseurl) {
        driver.get(baseurl);
    }

    public void doLogin(String login, String password){
        usernameField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public LoginClassicPageObject(WebDriver driver, String username, String password, String baseurl) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.username = username;
        this.password = password;
        this.baseurl = baseurl;
    }

    private String username;
    private String password;
    private String baseurl;

    private WebDriver driver;
}
