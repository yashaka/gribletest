package org.grible.gribletest.core.helpers;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 17:10
 */
public class SelenideHelpers {
    public static SelenideElement contextClick(SelenideElement element){
        (new Actions(getWebDriver())).contextClick(element).perform();
        return element;
    }

    public static void cleanCookies(){
        getWebDriver().manage().deleteAllCookies();
    }

    public static void pressF5(){
        $("body").sendKeys(Keys.F5);
    }

    public static void cleanAndSendAndTab(SelenideElement tf, String value){
        tf.should(Condition.visible).clear();
        sendAndTab(tf, value);
    }

    public static void sendAndTab(SelenideElement tf, String value){
        tf.sendKeys(value);
        tf.pressTab();
    }
}
