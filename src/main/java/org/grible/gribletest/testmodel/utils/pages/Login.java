package org.grible.gribletest.testmodel.utils.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.grible.gribletest.testmodel.pagegetters.AuthorizedPage;
import org.grible.gribletest.testmodel.pagegetters.LoginPage;
import org.grible.gribletest.resources.TestConfig;
import org.grible.gribletest.testmodel.utils.widgets.Dialog;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.grible.gribletest.core.helpers.SelenideHelpers.cleanAndSendAndTab;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 12:13
 */
public class Login {
    public static LoginPage page(){
        return new LoginPage(TestConfig.baseurl);
    }
    public static LoginPage page(AuthorizedPage authorizedPage){
        return new LoginPage(authorizedPage);
    }

    public static void open(String baseurl) {
        Selenide.open(baseurl);
    }

    public static SelenideElement container() { return $("#login-form");}

    public static SelenideElement usernameField(){ return $(By.name("username"));}
    public static SelenideElement passwordField(){ return $(By.name("pass"));}
    public static SelenideElement loginButton(){ return $(".ui-button[value='Log in']");}

    public static void doLogin(String login, String password){
        cleanAndSendAndTab(usernameField(),login);
//        usernameField().setValue(login);
        cleanAndSendAndTab(passwordField(), password);
//        passwordField().setValue(password);
        loginButton().click();
    }
}
